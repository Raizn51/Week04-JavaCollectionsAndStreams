package com.tit.day02javacollections.listinterface.nthelementfromtheend;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingNthElementFinder to test finding the Nth element from the end
class TestingNthElementFinder
{

    // Test method for finding the Nth element in TestingNthElementFinder
    @Test
    void testFindNthFromEnd() {
        // Creating an object of NthElementFinder
        NthElementFinder finder = new NthElementFinder();

        // Creating a LinkedList of strings
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Finding the 2nd element from the end
        String nthElement = finder.findNthFromEnd(list, 2);

        // Expected result
        String expected = "D";

        // Asserting the result
        assertEquals(expected, nthElement);
        System.out.println("Find Nth Element from End Test Passed");
    }
}
