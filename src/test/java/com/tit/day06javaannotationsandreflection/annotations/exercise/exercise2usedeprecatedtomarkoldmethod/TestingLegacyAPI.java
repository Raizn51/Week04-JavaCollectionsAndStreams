package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise2usedeprecatedtomarkoldmethod;

import com.tit.day06javaannotationsandreflection.annotations.exercise.exercise2usedeprecatedtomarkoldmethod.LegacyAPI;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingLegacyAPI to test LegacyAPI methods
class TestingLegacyAPI {

    // Test method for the deprecated oldFeature() method
    @Test
    void testOldFeature() {
        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Instantiate a LegacyAPI object and call oldFeature()
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();

        // Expected output
        String expectedOutput = "This is the old feature\r\n";

        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test method for the newFeature() method
    @Test
    void testNewFeature() {
        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Instantiate a LegacyAPI object and call newFeature()
        LegacyAPI api = new LegacyAPI();
        api.newFeature();

        // Expected output
        String expectedOutput = "This is the new feature\r\n";

        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }
}
