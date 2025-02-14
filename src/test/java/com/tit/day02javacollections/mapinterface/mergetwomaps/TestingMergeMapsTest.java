package com.tit.day02javacollections.mapinterface.mergetwomaps;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;

// Creating a class TestingMergeMapsTest to test the MergeMaps class
public class TestingMergeMapsTest
{

    @Test
    void testMerge() {
        // Creating two maps with test data
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        // Creating an object of MergeMaps
        MergeMaps mergeMaps = new MergeMaps();

        // Merging the maps and asserting the result
        Map<String, Integer> mergedMap = mergeMaps.merge(map1, map2);

        assertEquals(3, mergedMap.size(), "Merged map size should be 3");
        assertEquals(1, mergedMap.get("A"), "Merged map should contain key A with value 1");
        assertEquals(5, mergedMap.get("B"), "Merged map should contain key B with value 5");
        assertEquals(4, mergedMap.get("C"), "Merged map should contain key C with value 4");
    }
}
