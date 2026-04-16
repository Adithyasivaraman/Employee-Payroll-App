package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    // GET
    @GetMapping("/")
    public String getMessage() {
        return "Welcome to Employee Payroll App";
    }

    // GET by ID
    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable int id) {
        return "Getting employee with id: " + id;
    }

    // POST
    @PostMapping("/create")
    public String createEmployee(@RequestBody String employee) {
        return "Employee created: " + employee;
    }

    // PUT
    @PutMapping("/update")
    public String updateEmployee(@RequestBody String employee) {
        return "Employee updated: " + employee;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Employee deleted with id: " + id;
    }
}