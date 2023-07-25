package com.nic.demo_task.dao;

import com.nic.demo_task.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Long> {


}
