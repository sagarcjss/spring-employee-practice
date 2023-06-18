package com.cjss.service;

import com.cjss.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class EmployeeService {
    private List<EmployeeModel> employeeList = new ArrayList<>();

    public List<EmployeeModel> saveEmployee(EmployeeModel employeeModel){
        EmployeeModel employee = new EmployeeModel();
        employee.setEmployeeId(employeeModel.getEmployeeId());
        employee.setEmployeeName(employeeModel.getEmployeeName());
        employee.setSalary(employeeModel.getSalary());
        employee.setDept(employeeModel.getDept());
        employee.setLocation(employeeModel.getLocation());
        employee.setBenefits(employeeModel.getBenefits());
        employeeList.add(employee);
        return employeeList;
    }

    public  List<EmployeeModel> getEmployeeById(Integer id){
        return employeeList.stream().filter(emp -> emp.getEmployeeId() == id).collect(Collectors.toList());
    }

    public List<EmployeeModel> getAllEmployees(){
        return employeeList;
    }

    public List<EmployeeModel> deleteById(Integer id){
        Optional<EmployeeModel> optionalEmployee = employeeList.stream().filter(emp -> emp.getEmployeeId() == id).findAny();
        optionalEmployee.ifPresent(emp -> employeeList.remove(emp));
        return employeeList;
    }

    public List<EmployeeModel> updateEmployee(EmployeeModel employeeModel){
        Optional<EmployeeModel> optionalEmployee = employeeList.stream().filter(emp -> emp.getEmployeeId() == employeeModel.getEmployeeId()).findAny();
        if (optionalEmployee.isPresent()){
            EmployeeModel employee = new EmployeeModel();
            employee.setEmployeeId(employeeModel.getEmployeeId());
            employee.setEmployeeName(employeeModel.getEmployeeName());
            employee.setSalary(employeeModel.getSalary());
            employee.setDept(employeeModel.getDept());
            employee.setLocation(employeeModel.getLocation());
            employee.setBenefits(employeeModel.getBenefits());
            for (int i = 0; i < employeeList.size(); i++){
                if (employeeList.get(i).getEmployeeId() == employeeModel.getEmployeeId()){
                    employeeList.set(i, employee);
                }
            }
        }
        return employeeList;
    }
}
