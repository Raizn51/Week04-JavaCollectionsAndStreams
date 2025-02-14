package com.tit.day02javacollections.setinterface.insurancepolicymanagementsystem;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingPolicyManager {

    // Test for adding and retrieving all unique policies
    @Test
    void testAddPolicyAndRetrieveUniquePolicies() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Policy policy1 = new Policy("P123", "John Doe", sdf.parse("2025-12-15"), "Health", 1000.0);
        Policy policy2 = new Policy("P124", "Jane Smith", sdf.parse("2025-11-20"), "Auto", 800.0);
        Policy policy3 = new Policy("P125", "Alice Johnson", sdf.parse("2025-10-30"), "Home", 1200.0);
        Policy policy4 = new Policy("P123", "John Doe", sdf.parse("2025-12-15"), "Health", 1000.0);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4); // Duplicate policy

        Set<Policy> uniquePolicies = manager.getAllUniquePolicies();
        assertEquals(3, uniquePolicies.size(), "Unique policies size should be 3");
    }

    // Test for retrieving policies expiring soon
    @Test
    void testGetPoliciesExpiringSoon() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long thirtyDaysMillis = 30L * 24 * 60 * 60 * 1000;

        Policy policy1 = new Policy("P123", "John Doe", sdf.parse("2025-12-15"), "Health", 1000.0);
        Policy policy2 = new Policy("P124", "Jane Smith", sdf.parse("2025-11-20"), "Auto", 800.0);
        Policy policy3 = new Policy("P125", "Alice Johnson", new Date(System.currentTimeMillis() + thirtyDaysMillis), "Home", 1200.0);
        Policy policy4 = new Policy("P126", "Bob Brown", sdf.parse("2025-12-10"), "Health", 1000.0);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);

        Set<Policy> expiringSoon = manager.getPoliciesExpiringSoon(30);
        assertEquals(1, expiringSoon.size(), "Policies expiring soon size should be 1");
        assertTrue(expiringSoon.contains(policy3), "Policies expiring soon should contain policy3");
    }

    // Test for retrieving policies by coverage type
    @Test
    void testGetPoliciesByCoverageType() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Policy policy1 = new Policy("P123", "John Doe", sdf.parse("2025-12-15"), "Health", 1000.0);
        Policy policy2 = new Policy("P124", "Jane Smith", sdf.parse("2025-11-20"), "Auto", 800.0);
        Policy policy3 = new Policy("P125", "Alice Johnson", sdf.parse("2025-10-30"), "Health", 1200.0);
        Policy policy4 = new Policy("P126", "Bob Brown", sdf.parse("2025-12-10"), "Auto", 1000.0);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);

        Set<Policy> healthPolicies = manager.getPoliciesByCoverageType("Health");
        assertEquals(2, healthPolicies.size(), "Health policies size should be 2");
        assertTrue(healthPolicies.contains(policy1), "Health policies should contain policy1");
        assertTrue(healthPolicies.contains(policy3), "Health policies should contain policy3");
    }

    // Test for retrieving duplicate policies
    @Test
    void testGetDuplicatePolicies() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Policy policy1 = new Policy("P123", "John Doe", sdf.parse("2025-12-15"), "Health", 1000.0);
        Policy policy2 = new Policy("P124", "Jane Smith", sdf.parse("2025-11-20"), "Auto", 800.0);
        Policy policy3 = new Policy("P123", "John Doe", sdf.parse("2025-12-15"), "Health", 1000.0); // Duplicate
        Policy policy4 = new Policy("P126", "Bob Brown", sdf.parse("2025-12-10"), "Health", 1000.0);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3); // Duplicate policy
        manager.addPolicy(policy4);

        Set<Policy> duplicatePolicies = manager.getDuplicatePolicies();
        assertEquals(1, duplicatePolicies.size(), "Duplicate policies size should be 1");
        assertTrue(duplicatePolicies.contains(policy1), "Duplicate policies should contain policy1");
    }
}
