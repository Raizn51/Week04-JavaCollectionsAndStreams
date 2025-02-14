package com.tit.day02javacollections.listinterface.removeduplicateswhilepreservingorder;
/*
Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, four] → Output: [3, 1, 2, four].
*/

import java.util.*;

// Creating a class DuplicateRemoverWhilePreservingOrder to demonstrate removing duplicates while preserving order
public class DuplicateRemoverWhilePreservingOrder
{
    public static void main(String[] args) {
        // Creating an object of DuplicateRemover
        DuplicateRemover remover = new DuplicateRemover();

        // List of integers with duplicates
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

        // Removing duplicates from the list
        List<Integer> uniqueList = remover.removeDuplicates(list);

        // Printing the original and unique lists
        System.out.println("Original list: " + list);
        System.out.println("List without duplicates: " + uniqueList);
    }
}
