package com.azizkale.hibernatetutorial.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="tbl_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String department;
    @Column
    private String gender;
    @Column
    private Date dob;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                '}';
    }
}
