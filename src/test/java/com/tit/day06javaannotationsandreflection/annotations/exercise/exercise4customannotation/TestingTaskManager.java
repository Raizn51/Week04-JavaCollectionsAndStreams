package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise4customannotation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingTaskManager to test TaskManager class and the custom annotation
class TestingTaskManager {

    // Test method for task1() with @TaskInfo annotation
    @Test
    void testTask1Annotation() throws Exception {
        // Retrieve annotation details using Reflection API
        Method method = TaskManager.class.getMethod("task1");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        // Expected annotation values
        String expectedPriority = "High";
        String expectedAssignedTo = "Alice";

        // Asserting the annotation values
        assertEquals(expectedPriority, taskInfo.priority());
        assertEquals(expectedAssignedTo, taskInfo.assignedTo());
    }

    // Test method for task2() with @TaskInfo annotation
    @Test
    void testTask2Annotation() throws Exception {
        // Retrieve annotation details using Reflection API
        Method method = TaskManager.class.getMethod("task2");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        // Expected annotation values
        String expectedPriority = "Low";
        String expectedAssignedTo = "Bob";

        // Asserting the annotation values
        assertEquals(expectedPriority, taskInfo.priority());
        assertEquals(expectedAssignedTo, taskInfo.assignedTo());
    }
}

