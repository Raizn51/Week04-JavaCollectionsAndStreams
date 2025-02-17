package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise4customannotation;

import java.lang.reflect.Method;

/*
 * Exercise 4: Create a Custom Annotation and Use It
 * ✅ Problem Statement:
 * Create a custom annotation @TaskInfo to mark tasks with priority and assigned person.
 * 🔹 Steps to Follow:
 * 1. Define an annotation @TaskInfo with fields priority and assignedTo.
 * 2. Apply this annotation to a method in TaskManager class.
 * 3. Retrieve the annotation details using Reflection API.
 */

// Creating a main class to test the custom annotation and retrieve annotation details
public class Main {
    public static void main(String[] args) throws Exception {
        // Instantiate a TaskManager object
        TaskManager manager = new TaskManager();

        // Call the methods to see the execution output
        manager.task1();
        manager.task2();

        // Retrieve annotation details using Reflection API
        Method method1 = TaskManager.class.getMethod("task1");
        TaskInfo taskInfo1 = method1.getAnnotation(TaskInfo.class);
        System.out.println("Task 1 - Priority: " + taskInfo1.priority() + ", Assigned to: " + taskInfo1.assignedTo());

        Method method2 = TaskManager.class.getMethod("task2");
        TaskInfo taskInfo2 = method2.getAnnotation(TaskInfo.class);
        System.out.println("Task 2 - Priority: " + taskInfo2.priority() + ", Assigned to: " + taskInfo2.assignedTo());
    }
}

