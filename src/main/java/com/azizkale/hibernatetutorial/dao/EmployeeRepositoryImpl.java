package com.azizkale.hibernatetutorial.dao;

import com.azizkale.hibernatetutorial.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee find(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public void create(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public void delete(int id) {

    }
}
