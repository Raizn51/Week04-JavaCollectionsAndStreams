package com.tit.day02javacollections.mapinterface.invertamap;



import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingInvertMap to test the InvertMap class
public class TestingInvertMap
{


    @Test
    void testInvert()
    {
        // Creating an original map with test data
        java.util.Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Creating an object of InvertMap
        InvertMap invertMap = new InvertMap();

        // Inverting the map and asserting the result
        java.util.Map<Integer, List<String>> invertedMap = invertMap.invert(originalMap);

        assertEquals(2, invertedMap.size(), "Inverted map size should be 2");
        assertTrue(invertedMap.get(1).contains("A"), "Inverted map should contain key 1 with value A");
        assertTrue(invertedMap.get(1).contains("C"), "Inverted map should contain key 1 with value C");
        assertTrue(invertedMap.get(2).contains("B"), "Inverted map should contain key 2 with value B");
    }
}
