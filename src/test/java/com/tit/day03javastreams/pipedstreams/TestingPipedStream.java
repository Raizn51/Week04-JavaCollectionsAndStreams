package com.tit.day03javastreams.pipedstreams;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingPipedStream to test inter-thread communication using piped streams
class TestingPipedStream {

    // Test method for inter-thread communication using piped streams
    @Test
    void testPipedStreamCommunication() throws IOException, InterruptedException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        // Creating writer and reader threads
        WriterThread writer = new WriterThread(pos);
        ReaderThread reader = new ReaderThread(pis);

        // Starting threads
        writer.start();
        reader.start();

        // Ensuring both threads complete
        writer.join();
        reader.join();

        // Expected data
        StringBuilder expectedData = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            expectedData.append("Message ").append(i).append("\n");
        }

        // Asserting the received data
        assertEquals(expectedData.toString(), reader.getReceivedData());

        System.out.println("Piped Stream Test Passed");
    }
}
