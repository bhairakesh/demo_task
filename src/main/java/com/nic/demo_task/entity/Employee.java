package com.nic.demo_task.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "emp_code", length = 45)
    private String empCode;

    @Column(name = "emp_name", length = 45, nullable = false)
    private String empName;

    @Column(name = "emp_salary", nullable = false)
    private float empSalary;

    @Column(name = "dist_code", length = 2, nullable = false)
    private String distCode;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createdAt;
}
