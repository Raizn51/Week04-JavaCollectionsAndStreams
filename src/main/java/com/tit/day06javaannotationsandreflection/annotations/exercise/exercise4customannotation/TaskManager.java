package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise4customannotation;


// Creating a class TaskManager and applying the custom annotation to a method
// Creating a class TaskManager and applying the custom annotation to a method
public class TaskManager {

    // Apply the @TaskInfo annotation to the method
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void task1() {
        System.out.println("Executing task 1");
    }

    // Apply the @TaskInfo annotation to another method
    @TaskInfo(priority = "Low", assignedTo = "Bob")
    public void task2() {
        System.out.println("Executing task 2");
    }
}