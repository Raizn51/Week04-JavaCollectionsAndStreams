package com.tit.day02javacollections.mapinterface.groupobjectsbyproperty;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Creating a class GroupByDepartment to group employees by department
public class GroupByDepartment {

    // Method to group employees by department
    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee employee : employees) {
            departmentMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return departmentMap;
    }
}

