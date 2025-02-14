package com.tit.day02javacollections.extra.insurancepolicymanagementsystem;

import java.util.*;

// Creating a class PolicyManager to manage insurance policies
public class PolicyManager {
    Map<String, Policy> hashMap = new HashMap<>();
    Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    Map<Date, Policy> treeMap = new TreeMap<>();

    // Method to add a policy to all maps
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    // Method to retrieve a policy by its number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // Method to list all policies expiring within the next 30 days
    public List<Policy> listPoliciesExpiringSoon() {
        List<Policy> expiringSoon = new ArrayList<>();
        Date now = new Date();
        Date future = new Date(now.getTime() + 30L * 24 * 60 * 60 * 1000);

        for (Map.Entry<Date, Policy> entry : treeMap.entrySet()) {
            if (entry.getKey().after(now) && entry.getKey().before(future)) {
                expiringSoon.add(entry.getValue());
            }
        }
        return expiringSoon;
    }

    // Method to list all policies for a specific policyholder
    public List<Policy> listPoliciesByPolicyholder(String policyholderName) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : hashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Method to remove expired policies
    public void removeExpiredPolicies() {
        Date now = new Date();
        Iterator<Map.Entry<Date, Policy>> iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Date, Policy> entry = iterator.next();
            if (entry.getKey().before(now)) {
                hashMap.remove(entry.getValue().getPolicyNumber());
                linkedHashMap.remove(entry.getValue().getPolicyNumber());
                iterator.remove();
            }
        }
    }
}
