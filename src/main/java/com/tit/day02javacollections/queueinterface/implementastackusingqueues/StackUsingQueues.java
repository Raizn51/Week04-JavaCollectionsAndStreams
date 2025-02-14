package com.tit.day02javacollections.queueinterface.implementastackusingqueues;

import java.util.*;

// Creating a class StackUsingQueues to implement a stack using two queues
public class StackUsingQueues
{
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    // Method to push an element onto the stack
    public void push(int x) {
        queue1.add(x);
    }

    // Method to pop the top element from the stack
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except the last one to queue2
        while (queue1.size() > 1)
        {
            queue2.add(queue1.remove());
        }

        // The last element of queue1 is the top element of the stack
        int top = queue1.remove();

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    // Method to get the top element of the stack
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // The last element of queue1 is the top element of the stack
        int top = queue1.peek();
        queue2.add(queue1.remove());

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

