package com.tit.day03javastreams.serialization;

import java.io.*;
import java.util.List;

// Creating a class EmployeeManager to handle serialization and deserialization
public class EmployeeManager {

    // Method to serialize list of employees to a file
    public void serializeEmployees(List<Employee> employees, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
            System.out.println("Employees have been serialized to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize list of employees from a file
    @SuppressWarnings("unchecked")
    public List<Employee> deserializeEmployees(String fileName) {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees have been deserialized from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
