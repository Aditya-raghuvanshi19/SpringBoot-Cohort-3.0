package com.cohort3.springmvc.restapi.week2RestAPI.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private Integer age;

    private LocalDate dateOfJoining;
    private Boolean isActive;
}
