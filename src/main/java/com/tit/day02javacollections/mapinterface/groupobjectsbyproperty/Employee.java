package com.tit.day02javacollections.mapinterface.groupobjectsbyproperty;

import java.util.Objects;

// Creating a class Employee to represent an employee
public class Employee {
    private String name;
    private String department;

    // Constructor for the Employee class
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getter for the employee's name
    public String getName() {
        return name;
    }

    // Getter for the employee's department
    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department);
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}


