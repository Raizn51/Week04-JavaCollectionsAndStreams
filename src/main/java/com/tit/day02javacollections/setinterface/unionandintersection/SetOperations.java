package com.tit.day02javacollections.setinterface.unionandintersection;

import java.util.*;

// Creating a class SetOperations to perform union and intersection
public class SetOperations {

    // Method to compute the union of two sets
    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    // Method to compute the intersection of two sets
    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
