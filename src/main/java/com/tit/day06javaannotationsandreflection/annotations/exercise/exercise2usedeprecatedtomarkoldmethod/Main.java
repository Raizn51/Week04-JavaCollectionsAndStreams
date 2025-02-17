package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise2usedeprecatedtomarkoldmethod;

/*
 * Exercise 2: Use @Deprecated to Mark an Old Method
 * ✅ Problem Statement:
 * Create a class LegacyAPI with an old method oldFeature(), which should not be used anymore. Instead, introduce a new method newFeature().
 * 🔹 Steps to Follow:
 * 1. Define a class LegacyAPI.
 * 2. Mark oldFeature() as @Deprecated.
 * 3. Call both methods and observe the warning.
 */

// Creating a main class to test the deprecated and new methods
public class Main {
    public static void main(String[] args) {
        // Instantiating a LegacyAPI object
        LegacyAPI api = new LegacyAPI();

        // Calling the deprecated method
        api.oldFeature(); // This will show a deprecation warning

        // Calling the new method
        api.newFeature(); // This will not show any warning
    }
}

