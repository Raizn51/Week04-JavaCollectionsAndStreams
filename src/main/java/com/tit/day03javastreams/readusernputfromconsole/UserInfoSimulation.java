package com.tit.day03javastreams.readusernputfromconsole;

/*
3. Read User Input from Console
📌 Problem Statement:
Write a program that asks the user for their name, age, and favorite programming language, then saves this information into a file.
Requirements:
Use BufferedReader for console input.
Use FileWriter to write the data into a file.
Handle exceptions properly.
*/

// Creating a class UserInfoSimulation to demonstrate reading user input and saving to a file
public class UserInfoSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of UserInfo
        UserInfo userInfo = new UserInfo();

        // File name to save the user information
        String fileName = "src/main/resources/user_info.txt";

        // Read and save user information
        userInfo.readAndSaveUserInfo(fileName);
    }
}

