package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise3suppressuncheckedwarnings;

/*
 * Exercise 3: Suppress Unchecked Warnings
 * ✅ Problem Statement:
 * Create an ArrayList without generics and use @SuppressWarnings("unchecked") to hide compilation warnings.
 */

import java.util.ArrayList;

// Creating a class UncheckedWarningExample to demonstrate suppressing unchecked warnings
public class UncheckedWarningExample {

    // Method to demonstrate suppressing unchecked warnings
    @SuppressWarnings("unchecked")
    public void addToList() {
        // Creating an ArrayList without generics
        ArrayList list = new ArrayList();

        // Adding elements to the list
        list.add("Hello");
        list.add(123);

        // Printing the elements of the list
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
