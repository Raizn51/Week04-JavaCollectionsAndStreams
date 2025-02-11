package com.tit.day01javagenerics.multileveluniversitycoursemanagementsystem;

import java.util.List;

// Creating a class University to handle any type of course dynamically
class University {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayCourseDetails();
        }
    }
}
