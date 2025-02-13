package com.tit.day03javastreams.pipedstreams;

import java.io.*;

// Creating a class ReaderThread to handle reading data from PipedInputStream
class ReaderThread extends Thread {
    private PipedInputStream pis;
    private StringBuilder receivedData;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
        this.receivedData = new StringBuilder();
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                receivedData.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to get the received data
    public String getReceivedData() {
        return receivedData.toString();
    }
}