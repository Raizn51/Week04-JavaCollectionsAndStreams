package com.tit.day02javacollections.mapinterface.invertamap;

/*
Invert a Map
Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.
Example:
Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
 */

import java.util.*;

// Creating a class Map to demonstrate inverting a map
public class Map
{
    public static void main(String[] args) {
        // Creating an original map with test data
        java.util.Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Creating an object of InvertMap
        InvertMap invertMap = new InvertMap();

        // Inverting the map and printing the result
        java.util.Map<Integer, List<String>> invertedMap = invertMap.invert(originalMap);
        System.out.println("Inverted map: " + invertedMap);
    }
}
