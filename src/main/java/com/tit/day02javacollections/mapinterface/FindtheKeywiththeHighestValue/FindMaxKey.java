package com.tit.day02javacollections.mapinterface.FindtheKeywiththeHighestValue;

import java.util.Collections;
import java.util.Map;

// Creating a class FindMaxKey to find the key with the maximum value
public class FindMaxKey {

    // Method to find the key with the maximum value in a map
    public String findMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}

