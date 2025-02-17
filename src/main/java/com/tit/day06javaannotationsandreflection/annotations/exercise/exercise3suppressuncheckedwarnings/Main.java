package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise3suppressuncheckedwarnings;

/*
 * Exercise 3: Suppress Unchecked Warnings
 * ✅ Problem Statement:
 * Create an ArrayList without generics and use @SuppressWarnings("unchecked") to hide compilation warnings.
 */

// Creating a main class to test the UncheckedWarningExample class
public class Main {
    public static void main(String[] args) {
        // Instantiating an UncheckedWarningExample object
        UncheckedWarningExample example = new UncheckedWarningExample();
        // Calling the addToList() method
        example.addToList();
    }
}
