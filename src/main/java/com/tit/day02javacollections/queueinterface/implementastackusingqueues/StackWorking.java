package com.tit.day02javacollections.queueinterface.implementastackusingqueues;

/*
Implement a Stack Using Queues
Implement a stack data structure using two queues and support push, pop, and top operations.
Example:
Push 1, 2, 3 → Pop → Output: 3.
*/

import java.util.Scanner;

// Creating a class StackWorking to demonstrate the stack using queues
public class StackWorking
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        StackUsingQueues stack = new StackUsingQueues();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        // Displaying the top element
        System.out.println("Top element: " + stack.top());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Displaying the top element after popping
        System.out.println("Top element: " + stack.top());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Popping the last element
        System.out.println("Popped element: " + stack.pop());

        // Checking if the stack is empty after popping all elements
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
