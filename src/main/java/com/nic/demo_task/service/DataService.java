package com.nic.demo_task.service;

import com.nic.demo_task.entity.DistMaster;
import com.nic.demo_task.entity.Employee;
import com.nic.demo_task.model.EmployeeReqBody;

import java.util.List;

public interface DataService {


    List<DistMaster> getAllDist();

    Employee getEmployeeById(Long id);

    List<Employee> getAllEmployee();

    Employee saveEmployee(EmployeeReqBody body);
}
