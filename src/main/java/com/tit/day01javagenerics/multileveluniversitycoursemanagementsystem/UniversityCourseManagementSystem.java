package com.tit.day01javagenerics.multileveluniversitycoursemanagementsystem;
/*
3. Multi-Level University Course Management System
Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Problem Statement:
Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.
*/

import java.util.ArrayList;
import java.util.List;

// Creating a class UniversityCourseManagementSystem to Demonstration the University Course Management System
public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        // Creating course objects for different course types
        CourseType mathExamCourse = new ExamCourse("Mathematics");
        CourseType csAssignmentCourse = new AssignmentCourse("Computer Science");
        CourseType bioResearchCourse = new ResearchCourse("Biology");

        // Creating Course objects to manage courses of each type
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse((ExamCourse) mathExamCourse);

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse((AssignmentCourse) csAssignmentCourse);

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse((ResearchCourse) bioResearchCourse);

        // Display all courses in each category
        System.out.println("Exam Courses:");
        examCourses.displayAllCourses();

        System.out.println("\nAssignment Courses:");
        assignmentCourses.displayAllCourses();

        System.out.println("\nResearch Courses:");
        researchCourses.displayAllCourses();

        // Using University class to display all courses regardless of their type
        System.out.println("\nDisplaying all courses in the university:");
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(mathExamCourse);
        allCourses.add(csAssignmentCourse);
        allCourses.add(bioResearchCourse);

        University.displayAllCourses(allCourses);
    }
}
