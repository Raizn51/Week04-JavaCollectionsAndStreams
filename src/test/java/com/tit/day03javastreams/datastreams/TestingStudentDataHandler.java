package com.tit.day03javastreams.datastreams;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Creating a class TestingStudentDataHandler to test storing and retrieving student details
class TestingStudentDataHandler
{

    // Test method for storing and retrieving student details
    @Test
    void testStoreRetrieveStudentDetails() {
        // Creating an object of StudentDataHandler
        StudentDataHandler dataHandler = new StudentDataHandler();

        // Creating a student object
        Student student = new Student(101, "Alice", 3.8);

        // File name to store student details
        String fileName = "src/main/resources/test_student_data.bin";

        // Storing student details
        dataHandler.storeStudentDetails(fileName, student);

        // Retrieving student details
        Student retrievedStudent = dataHandler.retrieveStudentDetails(fileName);

        // Asserting the retrieved student details
        assertNotNull(retrievedStudent);
        assertEquals(student.getRollNumber(), retrievedStudent.getRollNumber());
        assertEquals(student.getName(), retrievedStudent.getName());
        assertEquals(student.getGpa(), retrievedStudent.getGpa());

        // Clean up temporary file
        new File(fileName).delete();

        System.out.println("Student Data Test Passed");
    }
}
