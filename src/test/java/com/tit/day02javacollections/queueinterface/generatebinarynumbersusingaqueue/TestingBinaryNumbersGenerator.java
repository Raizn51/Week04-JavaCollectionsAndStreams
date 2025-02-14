package com.tit.day02javacollections.queueinterface.generatebinarynumbersusingaqueue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;

// Creating a class TestingBinaryNumbersGenerator to test generating binary numbers using a queue
public class TestingBinaryNumbersGenerator {

    // Test method for generating binary numbers using a queue
    @Test
    void testGenerateBinaryNumbers() {
        Queue<String> binaryNumbers = BinaryNumbersGenerator.generateBinaryNumbers(5);

        Queue<String> expected = new LinkedList<>();
        expected.add("1");
        expected.add("10");
        expected.add("11");
        expected.add("100");
        expected.add("101");

        assertEquals(expected, binaryNumbers, "The binary numbers should be [\"1\", \"10\", \"11\", \"100\", \"101\"]");
    }
}
