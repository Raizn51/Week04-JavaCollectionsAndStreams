package com.tit.day03javastreams.readusernputfromconsole;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingUserInfo to test user input handling and file operations
class TestingUserInfo
{

    // Test method for reading and saving user information
    @Test
    void testReadAndSaveUserInfo() throws IOException {
        // Creating an object of UserInfo
        UserInfo userInfo = new UserInfo();

        // File name to save the user information
        String fileName = "src/main/resources/test_user_info.txt";

        // Simulate user input using ByteArrayInputStream
        String simulatedInput = "John Doe\n25\nJava\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Read and save user information
        userInfo.readAndSaveUserInfo(fileName);

        // Read the contents of the file
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        // Expected content
        String expectedContent = "Name: John Doe\nAge: 25\nFavorite Programming Language: Java\n";

        // Asserting the file content
        assertEquals(expectedContent, content.toString());

        // Clean up temporary file
        new File(fileName).delete();

        System.out.println("User Info Test Passed");
    }
}
