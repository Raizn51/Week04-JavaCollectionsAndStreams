package com.tit.day02javacollections.setinterface.findsubsets;

import java.util.Set;

// Creating a class SubsetChecker to check if one set is a subset of another
public class SubsetChecker
{

    // Method to check if set1 is a subset of set2
    public boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }
}
