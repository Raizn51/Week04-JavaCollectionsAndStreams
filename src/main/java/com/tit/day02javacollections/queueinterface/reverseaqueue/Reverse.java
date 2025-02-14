package com.tit.day02javacollections.queueinterface.reverseaqueue;

import java.util.Queue;

// Creating a class Reverse to reverse the elements of a queue
public class Reverse {

    // Method to reverse the elements of a queue
    public <T> Queue<T> reverse(Queue<T> queue) {
        if (queue.isEmpty()) {
            return queue;
        }

        T front = queue.remove();
        queue = reverse(queue);
        queue.add(front);
        return queue;
    }
}
