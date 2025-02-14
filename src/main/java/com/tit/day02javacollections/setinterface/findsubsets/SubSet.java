package com.tit.day02javacollections.setinterface.findsubsets;

/*
Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, four} → Output: true.
*/

import java.util.*;

// Creating a class SubSet to demonstrate subset checking
public class SubSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the elements of Set1
        System.out.print("Enter the elements of Set1 (comma-separated): ");
        String[] input1 = scanner.nextLine().split(",");
        Set<Integer> set1 = new HashSet<>();
        for (String s : input1) {
            set1.add(Integer.parseInt(s.trim()));
        }

        // Input the elements of Set2
        System.out.print("Enter the elements of Set2 (comma-separated): ");
        String[] input2 = scanner.nextLine().split(",");
        Set<Integer> set2 = new HashSet<>();
        for (String s : input2) {
            set2.add(Integer.parseInt(s.trim()));
        }

        // Creating an object of SubsetChecker
        SubsetChecker checker = new SubsetChecker();

        // Checking if set1 is a subset of set2
        boolean isSubset = checker.isSubset(set1, set2);
        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }
}
