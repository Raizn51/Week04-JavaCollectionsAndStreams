package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise5repeatableannotation;

// Creating a class BugTracker and applying the repeatable annotation to a method
public class BugTracker
{
    // Apply the @BugReport annotation multiple times on a method
    @BugReport(description = "Null pointer exception")
    @BugReport(description = "Array index out of bounds")
    public void processBugs()
    {
        System.out.println("Processing bugs...");
    }
}
