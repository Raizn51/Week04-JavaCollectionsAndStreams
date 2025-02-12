package com.tit.day02javacollections.listinterface.findfrequencyofelements;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingFrequencyFinder to test counting frequency of elements
class TestingFrequencyFinder
{

    // Test method for counting frequency of elements in FrequencyCounterTest
    @Test
    void testFrequencyCounter() {
        // Creating an object of FrequencyCounter
        FrequencyCounter counter = new FrequencyCounter();

        // List of strings
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        // Expected frequency map
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        // Counting frequency of elements
        Map<String, Integer> frequencyMap = counter.countFrequency(list);

        // Asserting the frequency map
        assertEquals(expected, frequencyMap);
        System.out.println("Frequency Counter Test Passed");
    }
}
