package com.tit.day02javacollections.setinterface.checkiftwosetsareequal;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class SetEqualityCheckerTest to test set equality check
class SetEqualityCheckerTest {

    // Test method for checking set equality in SetEqualityCheckerTest
    @Test
    void testAreSetsEqual() {
        // Creating an object of SetEqualityChecker
        SetEqualityChecker checker = new SetEqualityChecker();

        // Creating two sets with the same elements
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(2);
        set2.add(1);

        // Checking if the sets are equal
        boolean areEqual = checker.areSetsEqual(set1, set2);

        // Asserting that the sets are equal
        assertTrue(areEqual);
        System.out.println("Set Equality Check Test Passed");
    }
}
