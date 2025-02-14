package com.tit.day02javacollections.queueinterface.hospitaltriagesystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestingHospitalTriage {

    // Test method for adding patients and retrieving them in the correct order
    @Test
    void testHospitalTriage()
    {
        CustomPriorityQueue triageQueue = new CustomPriorityQueue();

        // Adding patients to the triage queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Asserting the order of patients treated
        Patient first = triageQueue.poll();
        assertEquals("Alice", first.getName(), "The first patient should be Alice");
        assertEquals(5, first.getSeverity(), "Alice's severity should be 5");

        Patient second = triageQueue.poll();
        assertEquals("John", second.getName(), "The second patient should be John");
        assertEquals(3, second.getSeverity(), "John's severity should be 3");

        Patient third = triageQueue.poll();
        assertEquals("Bob", third.getName(), "The third patient should be Bob");
        assertEquals(2, third.getSeverity(), "Bob's severity should be 2");
    }

    // Test method for checking if the queue is empty
    @Test
    void testIsEmpty()
    {
        CustomPriorityQueue triageQueue = new CustomPriorityQueue();

        // Asserting that the queue is initially empty
        assertTrue(triageQueue.isEmpty(), "The queue should be empty");

        // Adding a patient to the queue
        triageQueue.add(new Patient("John", 3));

        // Asserting that the queue is not empty after adding a patient
        assertFalse(triageQueue.isEmpty(), "The queue should not be empty");

        // Removing the patient from the queue
        triageQueue.poll();

        // Asserting that the queue is empty again
        assertTrue(triageQueue.isEmpty(), "The queue should be empty after removing the patient");
    }
}
