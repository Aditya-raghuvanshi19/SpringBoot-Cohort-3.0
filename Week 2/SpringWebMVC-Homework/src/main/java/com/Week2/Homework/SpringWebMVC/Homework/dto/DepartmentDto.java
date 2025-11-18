package com.Week2.Homework.SpringWebMVC.Homework.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Long id;
    private String title;

    @JsonProperty(value = "isActive")
    private boolean active;
    private LocalDate createdAt;

}
