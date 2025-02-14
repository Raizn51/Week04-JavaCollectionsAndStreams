package com.tit.day02javacollections.setinterface.unionandintersection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingSetOperations to test union and intersection of sets
class TestingSetOperations {

    // Test method for computing union in TestingSetOperations
    @Test
    void testUnion() {
        // Creating an object of SetOperations
        SetOperations operations = new SetOperations();

        // Creating two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Computing union
        Set<Integer> unionSet = operations.union(set1, set2);

        // Expected result
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        // Asserting the union set
        assertEquals(expected, unionSet);
        System.out.println("Union Test Passed");
    }

    // Test method for computing intersection in TestingSetOperations
    @Test
    void testIntersection() {
        // Creating an object of SetOperations
        SetOperations operations = new SetOperations();

        // Creating two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Computing intersection
        Set<Integer> intersectionSet = operations.intersection(set1, set2);

        // Expected result
        Set<Integer> expected = new HashSet<>();
        expected.add(3);

        // Asserting the intersection set
        assertEquals(expected, intersectionSet);
        System.out.println("Intersection Test Passed");
    }
}
