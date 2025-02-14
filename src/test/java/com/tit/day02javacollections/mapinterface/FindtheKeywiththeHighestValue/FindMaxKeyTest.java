package com.tit.day02javacollections.mapinterface.FindtheKeywiththeHighestValue;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;

// Creating a class FindMaxKeyTest to test the FindMaxKey class
public class FindMaxKeyTest {

    @Test
    void testFindMaxKey() {
        // Creating a map with test data
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        // Creating an object of FindMaxKey
        FindMaxKey findMaxKey = new FindMaxKey();

        // Asserting the key with the maximum value
        assertEquals("B", findMaxKey.findMaxKey(map), "The key with the highest value should be B");
    }
}
