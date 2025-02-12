package com.tit.day02javacollections.listinterface.reversealist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

// Creating a class TestingListReversal to test reversing ArrayList and LinkedList
class TestingListReversal
{

    // Test method for reversing an ArrayList in ListReversalTest
    @Test
    void testArrayListReversal()
    {
        // Creating an object of ListReverser
        ListReverser reverser = new ListReverser();

        // Creating and reversing an ArrayList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverser.reverseList(arrayList);

        // Expected reversed ArrayList
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);

        // Asserting the reversed ArrayList
        assertEquals(expected, arrayList);
        System.out.println("ArrayList Reversal Test Passed");
    }

    // Test method for reversing a LinkedList in ListReversalTest
    @Test
    void testLinkedListReversal() {
        // Creating an object of ListReverser
        ListReverser reverser = new ListReverser();

        // Creating and reversing a LinkedList
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverser.reverseList(linkedList);

        // Expected reversed LinkedList
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);

        // Asserting the reversed LinkedList
        assertEquals(expected, linkedList);
        System.out.println("LinkedList Reversal Test Passed");
    }
}