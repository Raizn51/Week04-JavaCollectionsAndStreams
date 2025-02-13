package com.tit.day03javastreams.serialization;
/*
4. Serialization - Save and Retrieve an Object
📌 Problem Statement:
Design a Java program that allows a user to store a list of employees in a file using Object Serialization and later retrieve the data from the file.
Requirements:
Create an Employee class with fields: id, name, department, salary.
Serialize the list of employees into a file (ObjectOutputStream).
Deserialize and display the employees from the file (ObjectInputStream).
Handle ClassNotFoundException and IOException.
*/

import java.util.ArrayList;
import java.util.List;

// Creating a class Serialization to demonstrate serialization and deserialization
public class Serialization
{
    public static void main(String[] args) {
        // Creating an object of EmployeeManager
        EmployeeManager manager = new EmployeeManager();

        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "IT", 50000));
        employees.add(new Employee(2, "Jane Smith", "HR", 60000));
        employees.add(new Employee(3, "Michael Brown", "Finance", 70000));

        // File name to serialize and deserialize employees
        String fileName = "src/main/resources/employees.ser";

        // Serializing the list of employees
        manager.serializeEmployees(employees, fileName);

        // Deserializing the list of employees
        List<Employee> deserializedEmployees = manager.deserializeEmployees(fileName);

        // Displaying the deserialized employees
        System.out.println("Deserialized Employees:");
        for (Employee emp : deserializedEmployees) {
            System.out.println(emp);
        }
    }
}
