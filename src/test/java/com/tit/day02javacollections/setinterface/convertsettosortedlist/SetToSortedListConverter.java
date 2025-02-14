package com.tit.day02javacollections.setinterface.convertsettosortedlist;
/*
Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
*/

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


// Creating a class SetToSortedListConverterTest to test converting a HashSet to a sorted list
class SetToSortedListConverter
{

    // Test method for converting a HashSet to a sorted list in SetToSortedListConverterTest
    @Test
    void testConvertToSortedList() {
        // Creating an object of SetToSortedList
        SetToSortedList converter = new SetToSortedList();

        // Creating a HashSet of integers
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Converting the HashSet to a sorted list
        List<Integer> sortedList = converter.convertToSortedList(set);

        // Expected sorted list
        List<Integer> expected = List.of(1, 3, 5, 9);

        // Asserting the sorted list
        assertEquals(expected, sortedList);
        System.out.println("Convert To Sorted List Test Passed");
    }
}
