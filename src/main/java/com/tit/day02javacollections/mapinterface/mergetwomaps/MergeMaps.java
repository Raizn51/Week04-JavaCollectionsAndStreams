package com.tit.day02javacollections.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

// Creating a class MergeMaps to merge two maps
public class MergeMaps {

    // Method to merge two maps and sum values for common keys
    public Map<String, Integer> merge(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }
}
