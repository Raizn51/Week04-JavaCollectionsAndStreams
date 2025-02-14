package com.tit.day02javacollections.mapinterface.invertamap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Creating a class InvertMap to invert a Map<K, V>
public class InvertMap {

    // Method to invert a Map<K, V> to produce a Map<V, List<K>>
    public <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // Add key to the list corresponding to the value in the inverted map
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}

