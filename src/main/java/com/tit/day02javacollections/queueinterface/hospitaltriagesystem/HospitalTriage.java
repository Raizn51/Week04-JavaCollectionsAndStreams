package com.tit.day02javacollections.queueinterface.hospitaltriagesystem;

// Creating a class HospitalTriage to manage the triage system
public class HospitalTriage
{

    // Method to simulate the hospital triage system
    public static void main(String[] args)
    {
        // Creating an object of CustomPriorityQueue
        CustomPriorityQueue triageQueue = new CustomPriorityQueue();

        // Adding patients to the triage queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Printing the order in which patients are treated
        System.out.println("Order of treatment:");
        while (!triageQueue.isEmpty())
        {
            Patient patient = triageQueue.poll();
            System.out.println(patient);
        }
    }
}

