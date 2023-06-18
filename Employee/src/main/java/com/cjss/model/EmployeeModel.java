package com.cjss.model;

import java.util.List;

public class EmployeeModel {
    private int employeeId;
    private String employeeName;
    private  double salary;
    private LocationModel location;
    private DepartmentModel dept;
    List<BenefitsModel> benefits;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public DepartmentModel getDept() {
        return dept;
    }

    public void setDept(DepartmentModel dept) {
        this.dept = dept;
    }

    public List<BenefitsModel> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<BenefitsModel> benefits) {
        this.benefits = benefits;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", location=" + location +
                ", dept=" + dept +
                ", benefits=" + benefits +
                '}';
    }
}
