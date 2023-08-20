package com.azizkale.hibernatetutorial.controller;

import com.azizkale.hibernatetutorial.model.Employee;
import com.azizkale.hibernatetutorial.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee find(@PathVariable int id){
        return employeeService.findById(id);
    }

    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee){
        try {
            employeeService.create(employee);
            return employee;
        } catch (Exception ex) {
            return null;
        }
    }

    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id){
        employeeService.delete(id);
        return "Employee has been deleted with id: " + id;
    }
}
