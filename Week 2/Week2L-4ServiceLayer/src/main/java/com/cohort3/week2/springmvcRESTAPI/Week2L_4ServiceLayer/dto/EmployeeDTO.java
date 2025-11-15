package com.cohort3.week2.springmvcRESTAPI.Week2L_4ServiceLayer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
//it is itself equal to
// @Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private Integer age;

    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private Boolean isActive;


}
