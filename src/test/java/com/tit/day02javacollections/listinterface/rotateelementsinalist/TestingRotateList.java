package com.tit.day02javacollections.listinterface.rotateelementsinalist;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingRotateList to test rotating elements in a list
class TestingRotateList
{

    // Test method for rotating elements in TestingRotateList
    @Test
    void testRotateList() {
        // Creating an object of RotateList
        RotateList rotator = new RotateList();

        // List of integers
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        // Rotating the list by 2 positions
        List<Integer> rotatedList = rotator.rotateList(list, 2);

        // Expected rotated list
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);

        // Asserting the rotated list
        assertEquals(expected, rotatedList);
        System.out.println("Rotate List Test Passed");
    }
}
