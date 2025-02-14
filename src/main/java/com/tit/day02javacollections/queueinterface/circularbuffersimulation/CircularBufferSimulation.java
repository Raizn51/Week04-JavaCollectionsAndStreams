package com.tit.day02javacollections.queueinterface.circularbuffersimulation;

/*
Circular Buffer Simulation
Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
*/

// Creating a class CircularBufferSimulation to demonstrate the circular buffer
public class CircularBufferSimulation
{
    public static void main(String[] args) {
        // Creating a circular buffer with a capacity of 3
        CircularBuffer buffer = new CircularBuffer(4);

        // Inserting elements into the buffer
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4);

        System.out.println("Buffer after inserting 1, 2, 3, four: " + buffer);

        // Inserting another element to overwrite the oldest element
        buffer.insert(5);
        System.out.println("Buffer after inserting 5: " + buffer);

        // Inserting more elements
        buffer.insert(6);
        buffer.insert(7);
        System.out.println("Buffer after inserting 6, 7: " + buffer);
    }
}

