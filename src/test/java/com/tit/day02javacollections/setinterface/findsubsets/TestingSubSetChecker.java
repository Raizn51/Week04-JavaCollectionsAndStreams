package com.tit.day02javacollections.setinterface.findsubsets;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingSubSetChecker to test subset checking
class TestingSubSetChecker
{
    // Test method for subset checking in TestingSubSetChecker
    @Test
    void testIsSubset()
    {
        // Creating an object of SubsetChecker
        SubsetChecker checker = new SubsetChecker();

        // Creating two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Checking if set1 is a subset of set2
        boolean isSubset = checker.isSubset(set1, set2);

        // Asserting the result
        assertTrue(isSubset);
        System.out.println("SubSet Check Test Passed");
    }
}
