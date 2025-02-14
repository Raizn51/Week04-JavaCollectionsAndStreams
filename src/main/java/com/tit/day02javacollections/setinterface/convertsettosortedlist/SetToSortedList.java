package com.tit.day02javacollections.setinterface.convertsettosortedlist;
/*
Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
*/

import java.util.*;

// Creating a class SetToSortedList to convert a HashSet to a sorted list
public class SetToSortedList {

    // Method to convert a HashSet to a sorted list
    public List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }
}