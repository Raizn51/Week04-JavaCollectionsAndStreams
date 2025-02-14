package com.tit.day02javacollections.queueinterface.circularbuffersimulation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Creating a class TestingCircularBuffer to test the circular buffer implementation
public class TestingCircularBuffer {

    // Test method for inserting elements and overwriting the oldest elements
    @Test
    void testCircularBuffer() {
        CircularBuffer buffer = new CircularBuffer(3);

        // Inserting elements into the buffer
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        assertArrayEquals(new int[]{1, 2, 3}, buffer.getBuffer(), "Buffer should contain [1, 2, 3]");

        // Inserting another element to overwrite the oldest element
        buffer.insert(4);
        assertArrayEquals(new int[]{2, 3, 4}, buffer.getBuffer(), "Buffer should contain [2, 3, four]");

        // Inserting more elements
        buffer.insert(5);
        buffer.insert(6);
        assertArrayEquals(new int[]{4, 5, 6}, buffer.getBuffer(), "Buffer should contain [four, 5, 6]");
    }
}
