package com.tit.day03javastreams.datastreams;


import java.io.*;

// Creating a class StudentDataHandler to handle data streams
class StudentDataHandler {

    // Method to store student details in a binary file
    public void storeStudentDetails(String fileName, Student student) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(student.getRollNumber());
            dos.writeUTF(student.getName());
            dos.writeDouble(student.getGpa());
            System.out.println("Student details stored in " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve student details from a binary file
    public Student retrieveStudentDetails(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Student details retrieved from " + fileName);
            return new Student(rollNumber, name, gpa);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

