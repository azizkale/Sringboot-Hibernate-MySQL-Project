package com.azizkale.hibernatetutorial.service;

import com.azizkale.hibernatetutorial.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee find(int id);
    void create(Employee employee);
    void delete (int id);
}
