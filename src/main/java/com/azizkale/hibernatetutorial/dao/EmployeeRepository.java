package com.azizkale.hibernatetutorial.dao;

import com.azizkale.hibernatetutorial.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    Employee findById(int id);
    void create(Employee employee);
    void delete (int id);
    Employee update(Employee employee);
}
