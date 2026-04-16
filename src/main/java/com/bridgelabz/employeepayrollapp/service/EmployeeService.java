package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String createEmployee(EmployeeDTO emp) {
        return "Service Layer: Created " + emp.getName();
    }
}