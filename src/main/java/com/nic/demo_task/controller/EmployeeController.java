package com.nic.demo_task.controller;

import com.nic.demo_task.entity.Employee;
import com.nic.demo_task.model.EmployeeReqBody;
import com.nic.demo_task.model.ResBody;
import com.nic.demo_task.service.DataService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final DataService dataService;

    public EmployeeController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return dataService.getEmployeeById(id);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployeeById() {
        return dataService.getAllEmployee();
    }


    @PostMapping("/store")
    public ResBody storeEmp(@Valid @RequestBody EmployeeReqBody body) {

        ResBody resBody = new ResBody("", true);

        try {
            Employee emp = dataService.saveEmployee(body);
            resBody.setMsg("Employee " + emp.getEmpCode() + " " + emp.getEmpName() + " Insert Successfully");


        } catch (Exception ex) {
            resBody.setMsg(ex.getMessage());
            resBody.setStatus(false);
        }


        return resBody;
    }


}
