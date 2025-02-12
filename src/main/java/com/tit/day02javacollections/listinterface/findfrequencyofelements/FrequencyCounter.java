package com.tit.day02javacollections.listinterface.findfrequencyofelements;

import java.util.*;

// Creating a class FrequencyCounter to find the frequency of elements
class FrequencyCounter
{
    // Method to count frequency of elements in a list
    public Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : list) {
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            } else {
                frequencyMap.put(item, 1);
            }
        }
        return frequencyMap;
    }
}



