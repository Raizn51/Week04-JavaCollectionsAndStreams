package com.tit.day02javacollections.queueinterface.hospitaltriagesystem;

import java.util.*;

// Creating a class CustomPriorityQueue to simulate a priority queue without using Comparable and Comparator
public class CustomPriorityQueue {
    private Queue<Patient> queue = new LinkedList<>();

    // Method to add a patient to the priority queue based on severity
    public void add(Patient patient) {
        if (queue.isEmpty()) {
            queue.add(patient);
        } else {
            Queue<Patient> tempQueue = new LinkedList<>();
            boolean added = false;

            while (!queue.isEmpty()) {
                Patient current = queue.poll();
                if (!added && current.getSeverity() < patient.getSeverity()) {
                    tempQueue.add(patient);
                    added = true;
                }
                tempQueue.add(current);
            }

            if (!added) {
                tempQueue.add(patient);
            }

            queue = tempQueue;
        }
    }

    // Method to remove and return the patient with the highest severity
    public Patient poll() {
        return queue.poll();
    }

    // Method to check if the priority queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}


