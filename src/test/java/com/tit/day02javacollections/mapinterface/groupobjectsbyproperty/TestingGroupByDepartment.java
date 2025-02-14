package com.tit.day02javacollections.mapinterface.groupobjectsbyproperty;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

// Creating a class TestingGroupByDepartment to test the GroupByDepartment class
public class TestingGroupByDepartment {

    @Test
    void testGroupByDepartment() {
        // Creating a list of employees
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Creating an object of GroupByDepartment
        GroupByDepartment groupByDepartment = new GroupByDepartment();

        // Grouping employees by department
        Map<String, List<Employee>> departmentMap = groupByDepartment.groupByDepartment(employees);

        // Asserting the grouped departments
        assertEquals(2, departmentMap.size(), "There should be 2 departments");

        // Asserting HR department
        List<Employee> hrEmployees = departmentMap.get("HR");
        assertNotNull(hrEmployees, "HR department should not be null");
        assertEquals(2, hrEmployees.size(), "HR department should have 2 employees");
        assertTrue(hrEmployees.contains(new Employee("Alice", "HR")), "HR department should contain Alice");
        assertTrue(hrEmployees.contains(new Employee("Carol", "HR")), "HR department should contain Carol");

        // Asserting IT department
        List<Employee> itEmployees = departmentMap.get("IT");
        assertNotNull(itEmployees, "IT department should not be null");
        assertEquals(1, itEmployees.size(), "IT department should have 1 employee");
        assertTrue(itEmployees.contains(new Employee("Bob", "IT")), "IT department should contain Bob");
    }
}
