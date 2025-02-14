package com.tit.day02javacollections.setinterface.insurancepolicymanagementsystem;

import java.util.*;

// Creating a class PolicyManager to manage insurance policies
public class PolicyManager {
    // Using HashSet for quick lookups
    private Set<Policy> hashSet = new HashSet<>();
    // Using LinkedHashSet to maintain the order of insertion
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    // Using TreeSet to maintain policies sorted by expiry date with a custom comparator
    private Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));

    // Method to add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Method to retrieve all unique policies
    public Set<Policy> getAllUniquePolicies() {
        return new HashSet<>(hashSet);
    }

    // Method to retrieve policies expiring soon (within the next 'days' days)
    public Set<Policy> getPoliciesExpiringSoon(int days) {
        Set<Policy> expiringSoon = new HashSet<>();
        Date now = new Date();
        long millisInDay = 24 * 60 * 60 * 1000L;

        for (Policy policy : treeSet) {
            long diff = (policy.getExpiryDate().getTime() - now.getTime()) / millisInDay;
            if (diff <= days && diff >= 0) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    // Method to retrieve policies with a specific coverage type
    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        Set<Policy> policies = new HashSet<>();
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Method to retrieve duplicate policies based on policy numbers
    public Set<Policy> getDuplicatePolicies() {
        Map<String, Integer> policyCount = new HashMap<>();
        Set<Policy> duplicates = new HashSet<>();

        for (Policy policy : hashSet) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        for (Policy policy : hashSet) {
            if (policyCount.get(policy.getPolicyNumber()) > 1) {
                duplicates.add(policy);
            }
        }

        // Create a new set to include all instances of duplicates
        Set<Policy> allDuplicates = new HashSet<>();
        for (Policy policy : hashSet) {
            if (duplicates.contains(policy)) {
                allDuplicates.add(policy);
            }
        }

        return allDuplicates;
    }


    // Methods to compare the performance of HashSet, LinkedHashSet, and TreeSet

    // Method to measure time taken to add a policy to a set
    public long timeToAddPolicy(Set<Policy> set, Policy policy) {
        long startTime = System.nanoTime();
        set.add(policy);
        long endTime = System.nanoTime();
        set.remove(policy); // Remove to keep the sets clean
        return endTime - startTime;
    }

    // Method to measure time taken to remove a policy from a set
    public long timeToRemovePolicy(Set<Policy> set, Policy policy) {
        set.add(policy); // Add the policy first
        long startTime = System.nanoTime();
        set.remove(policy);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Method to measure time taken to search for a policy in a set
    public long timeToSearchPolicy(Set<Policy> set, Policy policy) {
        long startTime = System.nanoTime();
        boolean found = set.contains(policy);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Method to compare the performance of HashSet, LinkedHashSet, and TreeSet
    public void comparePerformance(Policy policy) {
        System.out.println("Time to add policy:");
        System.out.println("HashSet: " + timeToAddPolicy(hashSet, policy) + " ns");
        System.out.println("LinkedHashSet: " + timeToAddPolicy(linkedHashSet, policy) + " ns");
        System.out.println("TreeSet: " + timeToAddPolicy(treeSet, policy) + " ns");

        System.out.println("Time to remove policy:");
        System.out.println("HashSet: " + timeToRemovePolicy(hashSet, policy) + " ns");
        System.out.println("LinkedHashSet: " + timeToRemovePolicy(linkedHashSet, policy) + " ns");
        System.out.println("TreeSet: " + timeToRemovePolicy(treeSet, policy) + " ns");

        System.out.println("Time to search policy:");
        System.out.println("HashSet: " + timeToSearchPolicy(hashSet, policy) + " ns");
        System.out.println("LinkedHashSet: " + timeToSearchPolicy(linkedHashSet, policy) + " ns");
        System.out.println("TreeSet: " + timeToSearchPolicy(treeSet, policy) + " ns");
    }
}
