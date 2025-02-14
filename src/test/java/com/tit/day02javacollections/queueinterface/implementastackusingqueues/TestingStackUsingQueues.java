package com.tit.day02javacollections.queueinterface.implementastackusingqueues;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Creating a class StackUsingQueuesTest to test the stack using queues
public class TestingStackUsingQueues
{

    // Test method for push, pop, and top operations
    @Test
    void testStackUsingQueues() {
        StackUsingQueues stack = new StackUsingQueues();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Asserting the top element
        assertEquals(3, stack.top(), "The top element should be 3");

        // Popping elements from the stack and asserting the values
        assertEquals(3, stack.pop(), "The popped element should be 3");
        assertEquals(2, stack.pop(), "The popped element should be 2");

        // Asserting the top element after popping
        assertEquals(1, stack.top(), "The top element should be 1");

        // Checking if the stack is empty
        assertFalse(stack.isEmpty(), "The stack should not be empty");

        // Popping the last element
        assertEquals(1, stack.pop(), "The popped element should be 1");

        // Checking if the stack is empty after popping all elements
        assertTrue(stack.isEmpty(), "The stack should be empty");
    }
}
