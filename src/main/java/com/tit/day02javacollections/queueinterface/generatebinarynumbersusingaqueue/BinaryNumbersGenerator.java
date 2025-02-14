package com.tit.day02javacollections.queueinterface.generatebinarynumbersusingaqueue;

/*
Generate Binary Numbers Using a Queue
Generate the first N binary numbers (as strings) using a queue.
Example:
N=5 → Output: ["1", "10", "11", "100", "101"].
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Creating a class BinaryNumbersGenerator to generate binary numbers using a queue
public class BinaryNumbersGenerator {

    // Method to generate the first N binary numbers
    public static Queue<String> generateBinaryNumbers(int N) {
        Queue<String> binaryNumbers = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            binaryNumbers.add(current);

            String next1 = current + "0";
            String next2 = current + "1";

            queue.add(next1);
            queue.add(next2);
        }
        return binaryNumbers;
    }

    // Main method to demonstrate the generateBinaryNumbers method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to generate its natural binary number : ");
        int N= sc.nextInt();
        Queue<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println("First " + N + " binary numbers: " + binaryNumbers);
    }
}
