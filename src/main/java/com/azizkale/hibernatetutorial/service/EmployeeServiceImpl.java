package com.azizkale.hibernatetutorial.service;

import com.azizkale.hibernatetutorial.dao.EmployeeRepository;
import com.azizkale.hibernatetutorial.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Transactional
    @Override
    public Employee find(int id) {
        return employeeRepository.find(id);
    }

    @Transactional
    @Override
    public void create(Employee employee) {
        employeeRepository.create(employee);
    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
