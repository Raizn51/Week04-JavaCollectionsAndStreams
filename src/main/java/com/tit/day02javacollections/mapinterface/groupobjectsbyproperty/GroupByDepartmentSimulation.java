package com.tit.day02javacollections.mapinterface.groupobjectsbyproperty;
/*
Group Objects by Property
Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].
*/
import java.util.*;

// Creating a class GroupByDepartmentSimulation to demonstrate grouping employees by department
public class GroupByDepartmentSimulation {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Creating an object of GroupByDepartment
        GroupByDepartment groupByDepartment = new GroupByDepartment();

        // Grouping employees by department and printing the result
        Map<String, List<Employee>> departmentMap = groupByDepartment.groupByDepartment(employees);
        System.out.println("Grouped by department: " + departmentMap);
    }
}

