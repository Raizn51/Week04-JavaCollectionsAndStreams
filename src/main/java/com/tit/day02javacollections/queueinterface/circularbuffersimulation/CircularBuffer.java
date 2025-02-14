package com.tit.day02javacollections.queueinterface.circularbuffersimulation;

import java.util.Arrays;

// Creating a class CircularBuffer to implement a circular buffer using an array
public class CircularBuffer
{
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    // Constructor for the CircularBuffer class
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    // Method to insert an element into the circular buffer
    public void insert(int element) {
        if (size == capacity) {
            head = (head + 1) % capacity; // Overwrite the oldest element
        } else {
            size++;
        }
        buffer[tail] = element;
        tail = (tail + 1) % capacity;
    }

    // Method to retrieve the elements in the circular buffer
    public int[] getBuffer() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = buffer[(head + i) % capacity];
        }
        return result;
    }

    // Overriding the toString method to return a string representation of the buffer
    @Override
    public String toString() {
        return Arrays.toString(getBuffer());
    }
}

