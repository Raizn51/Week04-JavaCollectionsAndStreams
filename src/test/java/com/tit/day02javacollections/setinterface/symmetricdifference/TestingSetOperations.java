package com.tit.day02javacollections.setinterface.symmetricdifference;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Creating a class SetOperationsTest to test symmetric difference of sets
public class TestingSetOperations
{

    // Test method for computing symmetric difference in SetOperationsTest
    @Test
    void testSymmetricDifference() {
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

        // Computing symmetric difference
        Set<Integer> symmetricDifferenceSet = operations.symmetricDifference(set1, set2);

        // Expected result
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        // Asserting the symmetric difference set
        assertEquals(expected, symmetricDifferenceSet);
        System.out.println("Symmetric Difference Test Passed");
    }
}
