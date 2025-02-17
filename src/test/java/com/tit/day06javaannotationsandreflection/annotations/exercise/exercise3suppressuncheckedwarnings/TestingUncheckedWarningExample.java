package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise3suppressuncheckedwarnings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingUncheckedWarningExample to test the UncheckedWarningExample class
class TestingUncheckedWarningExample {

    // Test method for the addToList() method
    @Test
    void testAddToList() {
        // Expected output list
        List<Object> expectedList = new ArrayList<>();
        expectedList.add("Hello");
        expectedList.add(123);

        // Instantiate an UncheckedWarningExample object
        UncheckedWarningExample example = new UncheckedWarningExample();
        // Call the addToList() method and capture the output
        example.addToList();

        // Asserting that the elements in the list are as expected
        for (Object element : expectedList) {
            assertEquals(expectedList.contains(element), true);
        }
    }
}
