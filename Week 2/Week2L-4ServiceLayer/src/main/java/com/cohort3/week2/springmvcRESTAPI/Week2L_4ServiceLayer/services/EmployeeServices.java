package com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.services;

import com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.dto.EmployeeDTO;
import com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.entities.EmployeeEntity;
import com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServices {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper; //to get the bean of this we have to define it as a bean so for this use config file

    public EmployeeServices(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    //    public EmployeeEntity getEmployeeByID(Long id) {
//        return employeeRepository.findById(id).orElseThrow(()->new IllegalArgumentException("no employee find by this id: "+id));
//    } //this is not secure way as we expose the actual employeeEntity to the controller side so better to use the DTO

    // 1. way by manual convert the returned employeeEntity by repository to DTO
//    public EmployeeDTO getEmployeeByID(Long id) {
//        EmployeeEntity employeeEntity= employeeRepository.findById(id).orElseThrow(()->new IllegalArgumentException("no employee find by this id: "+id));
//        return new EmployeeDTO(employeeEntity.getId(),employeeEntity.getName(),employeeEntity.getEmail(),employeeEntity.getAge(),employeeEntity.getDateOfJoining(),employeeEntity.getIsActive());
//    }

    // 2 . way is use the ModelMapper
    public EmployeeDTO getEmployeeByID(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("no employee find by this id: " + id));
        return modelMapper.map(employeeEntity, EmployeeDTO.class);

    }
//    public List<EmployeeEntity> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity) {
//        return employeeRepository.save(employeeEntity);
//    }
public List<EmployeeDTO> getAllEmployees() {
    List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
    // now here we use stream API for conversion one list into another without affecting the previous one

    return employeeEntities
            .stream()
            .map(employeeEntity ->modelMapper.map(employeeEntity,EmployeeDTO.class))
            .collect(Collectors.toList());
}

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
       EmployeeEntity employeeEntity = modelMapper.map(employeeDTO,EmployeeEntity.class);
        EmployeeEntity savedemployeeEntity= employeeRepository.save(employeeEntity);
       return modelMapper.map(savedemployeeEntity,EmployeeDTO.class);
    }

}
