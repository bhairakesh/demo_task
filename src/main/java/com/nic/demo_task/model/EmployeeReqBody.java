package com.nic.demo_task.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeReqBody {

    @NotBlank
    private String emp_name;

    @Positive
    private Float emp_salary;

    @NotBlank
    private String dist_code;


}
