package com.tit.day05javaragexandjunit.javaragex.advancedproblems.extractprogramminglanguagenames;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Arrays;

// Creating a class TestingProgrammingLanguageExtractor to test programming language extraction operations
class TestingProgrammingLanguageExtractor {

    // Test method for extracting programming languages
    @Test
    void testExtractProgrammingLanguages() {
        // Example text
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        // Expected output
        List<String> expectedLanguages = Arrays.asList("Java", "Python", "Javascript", "Go");
        // Asserting the extracted programming languages
        assertEquals(expectedLanguages, ProgrammingLanguageExtractor.extractProgrammingLanguages(text));
    }

    // Test method for text without programming languages
    @Test
    void testNoProgrammingLanguages() {
        // Example text without programming languages
        String text = "This text does not mention any programming languages.";
        // Expected output
        List<String> expectedLanguages = Arrays.asList();
        // Asserting the extracted programming languages
        assertEquals(expectedLanguages, ProgrammingLanguageExtractor.extractProgrammingLanguages(text));
    }

    // Test method for text with multiple formats of programming languages
    @Test
    void testVariousProgrammingLanguagesFormats() {
        // Example text with various formats of programming languages
        String text = "Languages: Java, PYTHON, JavaScript, and go.";
        // Expected output
        List<String> expectedLanguages = Arrays.asList("Java", "Python", "Javascript", "Go");
        // Asserting the extracted programming languages
        assertEquals(expectedLanguages, ProgrammingLanguageExtractor.extractProgrammingLanguages(text));
    }
}
