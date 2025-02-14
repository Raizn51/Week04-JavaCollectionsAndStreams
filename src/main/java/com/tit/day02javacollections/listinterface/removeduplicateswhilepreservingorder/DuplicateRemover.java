package com.tit.day02javacollections.listinterface.removeduplicateswhilepreservingorder;

import java.util.*;

// Creating a class DuplicateRemover to remove duplicates while preserving order
public class DuplicateRemover {
    // Method to remove duplicates while preserving order
    public <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (!seen.contains(item)) {
                seen.add(item);
                result.add(item);
            }
        }
        return result;
    }
}
