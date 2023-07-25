package com.nic.demo_task.service.imp;

import com.nic.demo_task.dao.DistDao;
import com.nic.demo_task.dao.EmployeeDao;
import com.nic.demo_task.entity.DistMaster;
import com.nic.demo_task.entity.Employee;
import com.nic.demo_task.model.EmployeeReqBody;
import com.nic.demo_task.service.DataService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DataServiceImp implements DataService {

    private final DistDao distDao;

    private final EmployeeDao employeeDao;

    public DataServiceImp(DistDao distDao, EmployeeDao employeeDao) {
        this.distDao = distDao;
        this.employeeDao = employeeDao;
    }

    @Override
    public List<DistMaster> getAllDist() {
        return distDao.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeDao.findById(id).orElseThrow();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.findAll();
    }

    @Override
    public Employee saveEmployee(EmployeeReqBody body) {
        Employee newEmp = new Employee();
        newEmp.setEmpCode("EmpAuto");
        newEmp.setEmpSalary(body.getEmp_salary());
        newEmp.setEmpName(body.getEmp_name());
        newEmp.setDistCode(body.getDist_code());
        newEmp.setCreatedAt(LocalDateTime.now());
        newEmp = employeeDao.save(newEmp);
        newEmp.setEmpCode("Emp" + newEmp.getId());
        return employeeDao.save(newEmp);

    }
}
