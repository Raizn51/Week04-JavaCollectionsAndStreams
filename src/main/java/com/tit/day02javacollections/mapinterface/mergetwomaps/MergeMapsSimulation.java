package com.tit.day02javacollections.mapinterface.mergetwomaps;

/*
Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.
Example:
Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.
 */

import java.util.*;

// Creating a class MergeMapsSimulation to demonstrate merging two maps
public class MergeMapsSimulation {
    public static void main(String[] args) {
        // Creating two maps with test data
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        // Creating an object of MergeMaps
        MergeMaps mergeMaps = new MergeMaps();

        // Merging the maps and printing the result
        Map<String, Integer> mergedMap = mergeMaps.merge(map1, map2);
        System.out.println("Merged map: " + mergedMap);
    }
}
