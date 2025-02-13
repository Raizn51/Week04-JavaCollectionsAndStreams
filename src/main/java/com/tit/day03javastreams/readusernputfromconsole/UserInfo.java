package com.tit.day03javastreams.readusernputfromconsole;

import java.io.*;

// Creating a class UserInfo to handle user input and file operations
public class UserInfo
{
    // Method to read user input from console and save it to a file
    public void readAndSaveUserInfo(String fileName) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String favoriteLanguage = reader.readLine();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + favoriteLanguage + "\n");

            System.out.println("User information saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
