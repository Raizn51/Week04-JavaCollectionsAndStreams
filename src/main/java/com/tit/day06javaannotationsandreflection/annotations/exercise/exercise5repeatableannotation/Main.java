package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise5repeatableannotation;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
 * Exercise 5: Create and Use a Repeatable Annotation
 * ✅ Problem Statement:
 * Define an annotation @BugReport that can be applied multiple times on a method.
 * 🔹 Steps to Follow:
 * 1. Define @BugReport with a description field.
 * 2. Use @Repeatable to allow multiple bug reports.
 * 3. Apply it twice on a method.
 * 4. Retrieve and print all bug reports.
 */

// Creating a main class to test the repeatable annotation and retrieve annotation details
public class Main {
    public static void main(String[] args) throws Exception {
        // Instantiate a BugTracker object
        BugTracker tracker = new BugTracker();

        // Call the method to see the execution output
        tracker.processBugs();

        // Retrieve annotation details using Reflection API
        Method method = BugTracker.class.getMethod("processBugs");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        // Print all bug reports
        Arrays.stream(bugReports)
                .forEach(bug -> System.out.println("Bug description: " + bug.description()));
    }
}
