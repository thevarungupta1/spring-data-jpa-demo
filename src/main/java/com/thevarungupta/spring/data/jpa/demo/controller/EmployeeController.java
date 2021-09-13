package com.thevarungupta.spring.data.jpa.demo.controller;

import com.thevarungupta.spring.data.jpa.demo.entity.Employee;
import com.thevarungupta.spring.data.jpa.demo.service.EmployeeImpl;
import com.thevarungupta.spring.data.jpa.demo.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") long employeeId) {
        return service.getEmployeeById(employeeId);
    }

    @DeleteMapping("/employees/{id}")
    public Employee deleteEmployee(@PathVariable("id") long employeeId) {
        return service.deleteEmployee(employeeId);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") long employeeId, @RequestBody Employee employee) {
        return service.updateEmployee(employeeId, employee);
    }
}
