package com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.controllers;

import com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.dto.EmployeeDTO;
import com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.entities.EmployeeEntity;
import com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.services.EmployeeServices;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeServices employeeServices;

    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }
//    public EmployeeController(EmployeeServices employeeServices) {
//        this.employeeServices = employeeServices;
//    }

    //    @GetMapping("/{employeeID}")
//    public EmployeeEntity getEmployeeByID(@PathVariable(name = "employeeID") Long id){
//        return employeeServices.getEmployeeByID(id);
//    }
        @GetMapping("/{employeeID}")
    public EmployeeDTO getEmployeeByID(@PathVariable(name = "employeeID") Long id){
        return employeeServices.getEmployeeByID(id);
    }

//    @GetMapping
//    public List<EmployeeEntity> getAllEmployees(@RequestParam(name = "sortByName",required = false) String name ){
//        return employeeServices.getAllEmployees();
//    }
    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(name = "sortByName",required = false) String name ){
        return employeeServices.getAllEmployees();
    }

//    @PostMapping
//    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity){
//        return employeeServices.createNewEmployee(employeeEntity);
//    }
    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){  //as we also accept the request body in the form of the DTO from the user as the user do not know what is are the fields actually storing in the DB
        return employeeServices.createNewEmployee(employeeDTO);
    }
    // in this case lombok creates issue as serializing employeeDTO into JSON by jackson it fails and getting 406 not acceptable output , because jackson not find getter method by lombok  so either use own getter setter(but in this case getting null in the value of response) or config lombok in pom.xml by version
}
