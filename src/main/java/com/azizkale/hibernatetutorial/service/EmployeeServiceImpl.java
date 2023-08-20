package com.azizkale.hibernatetutorial.service;

import com.azizkale.hibernatetutorial.dao.EmployeeRepository;
import com.azizkale.hibernatetutorial.exception.EmployeeNotFoundException;
import com.azizkale.hibernatetutorial.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
    public Employee findById(int id) throws EmployeeNotFoundException {
        Employee employee = employeeRepository.findById(id);
        if(employee == null) {
            throw new EmployeeNotFoundException("Employee not found with id :" + id);
        }
        return employee;
    }

    @Transactional
    @Override
    public void create(Employee employee) {
        employeeRepository.create(employee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        employeeRepository.delete(id);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.update(employee);
    }
}
