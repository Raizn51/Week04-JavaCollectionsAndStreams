package com.tit.day03javastreams.serialization;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingEmployeeManager to test serialization and deserialization
class TestingEmployeeManager
{

    // Test method for serializing and deserializing employees
    @Test
    void testSerializeDeserializeEmployees() {
        // Creating an object of EmployeeManager
        EmployeeManager manager = new EmployeeManager();

        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "IT", 50000));
        employees.add(new Employee(2, "Jane Smith", "HR", 60000));
        employees.add(new Employee(3, "Michael Brown", "Finance", 70000));

        // File name to serialize and deserialize employees
        String fileName = "test_employees.serialization";

        // Serializing the list of employees
        manager.serializeEmployees(employees, fileName);

        // Deserializing the list of employees
        List<Employee> deserializedEmployees = manager.deserializeEmployees(fileName);

        // Asserting the deserialized employees
        assertEquals(employees.size(), deserializedEmployees.size());
        for (int i = 0; i < employees.size(); i++) {
            assertEquals(employees.get(i).toString(), deserializedEmployees.get(i).toString());
        }

        // Clean up temporary file
        new File(fileName).delete();

        System.out.println("Serialization Test Passed");
    }
}
