package com.tit.day02javacollections.setinterface.symmetricdifference;

import java.util.*;

// Creating a class SetOperations to perform symmetric difference
public class SetOperations {

    // Method to compute the symmetric difference of two sets
    public Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        for (Integer element : set2) {
            if (!symmetricDiff.add(element))
            {
                symmetricDiff.remove(element);
            }
        }
        return symmetricDiff;
    }
}
