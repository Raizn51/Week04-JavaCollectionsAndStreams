package com.tit.day02javacollections.listinterface.removeduplicateswhilepreservingorder;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingDuplicateRemoverTest to test removing duplicates while preserving order
class TestingDuplicateRemoverTest {

    // Test method for removing duplicates in TestingDuplicateRemoverTest
    @Test
    void testRemoveDuplicates() {
        // Creating an object of DuplicateRemover
        DuplicateRemover remover = new DuplicateRemover();

        // List of integers with duplicates
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

        // Removing duplicates from the list
        List<Integer> uniqueList = remover.removeDuplicates(list);

        // Expected list without duplicates
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);

        // Asserting the unique list
        assertEquals(expected, uniqueList);
        System.out.println("Remove Duplicates Test Passed");
    }
}
