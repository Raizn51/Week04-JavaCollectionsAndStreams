package com.tit.day02javacollections.extra.insurancepolicymanagementsystem;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class TestingPolicyManager {

    // Helper method to create a PolicyManager with test data
    private PolicyManager createPolicyManager() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Adding some policies
        manager.addPolicy(new Policy("P123", "John Doe", sdf.parse("2025-12-15")));
        manager.addPolicy(new Policy("P124", "Jane Smith", sdf.parse("2025-11-20")));
        manager.addPolicy(new Policy("P125", "Alice Johnson", sdf.parse("2025-10-30")));
        manager.addPolicy(new Policy("P126", "Bob Brown", sdf.parse("2025-12-10")));
        manager.addPolicy(new Policy("P127", "John Doe", sdf.parse("2023-12-15")));

        return manager;
    }

    // Test method for retrieving a policy by its number
    @Test
    void testGetPolicyByNumber() throws ParseException {
        PolicyManager manager = createPolicyManager();
        Policy policy = manager.getPolicyByNumber("P123");

        assertNotNull(policy, "Policy P123 should not be null");
        assertEquals("John Doe", policy.getPolicyholderName(), "Policyholder name should be John Doe");
    }

    // Test method for listing all policies expiring within the next 30 days
    @Test
    void testListPoliciesExpiringSoon() throws ParseException {
        PolicyManager manager = createPolicyManager();
        List<Policy> expiringSoon = manager.listPoliciesExpiringSoon();

        assertEquals(1, expiringSoon.size(), "There should be 1 policy expiring within the next 30 days");
        assertEquals("P124", expiringSoon.get(0).getPolicyNumber(), "Policy P124 should be expiring soon");
    }

    // Test method for listing all policies for a specific policyholder
    @Test
    void testListPoliciesByPolicyholder() throws ParseException {
        PolicyManager manager = createPolicyManager();
        List<Policy> johnDoePolicies = manager.listPoliciesByPolicyholder("John Doe");

        assertEquals(2, johnDoePolicies.size(), "John Doe should have 2 policies");
        assertTrue(johnDoePolicies.stream().anyMatch(policy -> policy.getPolicyNumber().equals("P123")), "John Doe should have policy P123");
        assertTrue(johnDoePolicies.stream().anyMatch(policy -> policy.getPolicyNumber().equals("P127")), "John Doe should have policy P127");
    }

    // Test method for removing expired policies
    @Test
    void testRemoveExpiredPolicies() throws ParseException {
        PolicyManager manager = createPolicyManager();
        manager.removeExpiredPolicies();

        assertNull(manager.getPolicyByNumber("P127"), "Expired policy P127 should be removed");
        assertNotNull(manager.getPolicyByNumber("P123"), "Policy P123 should not be removed");
    }
}
