package com.cjss.controller;

import com.cjss.service.EmployeeService;
import com.cjss.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("employee-save")
    public List<EmployeeModel> saveEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.saveEmployee(employeeModel);
    }

    @GetMapping("employee-get/{id}")
    public List<EmployeeModel> getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("employee-get")
    public List<EmployeeModel> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @PutMapping("employee-update")
    public List<EmployeeModel> updateEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.updateEmployee(employeeModel);
    }

    @DeleteMapping("employee-delete/{id}")
    public List<EmployeeModel> deleteEmployeeById(@PathVariable Integer id){
        return employeeService.deleteById(id);
    }
}
