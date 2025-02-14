package com.tit.day02javacollections.setinterface.checkiftwosetsareequal;

import java.util.*;

// Creating a class SetEqualityChecker to check if two sets are equal
public class SetEqualityChecker
{
    // Method to check if two sets are equal
    public boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2)
    {
        return set1.equals(set2);
    }
}
