package com.tit.day02javacollections.extra.insurancepolicymanagementsystem;
/*
Insurance Policy Management System

Each policy has the following attributes:
● Policy Number (unique identifier)
● Policyholder Name
● Expiry Date
● Coverage Type (e.g., Health, Auto, Home)
● Premium Amount

Requirements:
1. Store Unique Policies: Implement methods to store policies using different
types of sets (HashSet, LinkedHashSet, TreeSet), each serving different
purposes:
 HashSet for quick lookups.
 LinkedHashSet to maintain the order of insertion.
 TreeSet to maintain policies sorted by expiry date.

2. Retrieve Policies: Implement methods to retrieve and display policies based on
certain criteria:
 All unique policies.
 Policies expiring soon (within the next 30 days
 Policies with a specific coverage type.
 Duplicate policies based on policy numbers.

3. Performance Comparison: Compare the performance of HashSet,
LinkedHashSet, and TreeSet in terms of adding, removing, and searching for
policies.
*/


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Creating a class InsurancePolicyManagementSystem to demonstrate the PolicyManager
public class InsurancePolicyManagementSystem
{
    public static void main(String[] args) throws ParseException
    {
        PolicyManager manager = new PolicyManager();

        // Adding some policies
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        manager.addPolicy(new Policy("P123", "John Doe", sdf.parse("2025-12-15")));
        manager.addPolicy(new Policy("P124", "Jane Smith", sdf.parse("2025-11-20")));
        manager.addPolicy(new Policy("P125", "Alice Johnson", sdf.parse("2025-10-30")));
        manager.addPolicy(new Policy("P126", "Bob Brown", sdf.parse("2025-12-10")));
        manager.addPolicy(new Policy("P127", "John Doe", sdf.parse("2023-12-15")));

        // Retrieving a policy by its number
        System.out.println("Policy P123: " + manager.getPolicyByNumber("P123"));

        // Listing all policies expiring within the next 30 days
        List<Policy> expiringSoon = manager.listPoliciesExpiringSoon();
        System.out.println("Policies expiring within the next 30 days:");
        expiringSoon.forEach(System.out::println);

        // Listing all policies for a specific policyholder
        List<Policy> johnDoePolicies = manager.listPoliciesByPolicyholder("John Doe");
        System.out.println("Policies for John Doe:");
        johnDoePolicies.forEach(System.out::println);

        // Removing expired policies
        manager.removeExpiredPolicies();
        System.out.println("Policies after removing expired ones:");
        System.out.println("HashMap: " + manager.hashMap);
        System.out.println();
        System.out.println("LinkedHashMap: " + manager.linkedHashMap);
        System.out.println();
        System.out.println("TreeMap: " + manager.treeMap);
    }
}

