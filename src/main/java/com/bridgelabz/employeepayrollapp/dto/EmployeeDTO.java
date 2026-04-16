package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.NotEmpty;

public class EmployeeDTO {

    @NotEmpty(message = "Name cannot be empty")
    private String name;
    private double salary;

    public EmployeeDTO() {}

    public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}