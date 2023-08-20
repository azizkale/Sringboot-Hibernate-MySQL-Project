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

    @GetMapping("/e")
    public Employee get(int id){
        return employeeService.get(id);
    }

    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee){
        try {
            employeeService.create(employee);
//            Integer id = employee.getId();
//            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
            return employee;
        } catch (Exception ex) {
            return null;
        }
    }
}
