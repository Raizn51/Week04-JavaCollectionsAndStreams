package com.tit.day02javacollections.queueinterface.reverseaqueue;

/*
Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].
*/

import java.util.*;

// Creating a class ReverseAQueue to demonstrate reversing elements in a queue
public class ReverseAQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the elements of the queue
        System.out.print("Enter the elements of the queue (comma-separated): ");
        String[] input = scanner.nextLine().split(",");
        Queue<Integer> queue = new LinkedList<>();
        for (String s : input) {
            queue.add(Integer.parseInt(s.trim()));
        }

        // Creating an object of Reverse
        Reverse reverse = new Reverse();

        // Reversing the queue
        queue = reverse.reverse(queue);

        // Printing the reversed queue
        System.out.println("Reversed queue: " + queue);
    }
}

