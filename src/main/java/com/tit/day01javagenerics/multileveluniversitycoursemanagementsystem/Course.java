package com.tit.day01javagenerics.multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Creating a generic class Course<T extends CourseType> to manage different courses
class Course<T extends CourseType> {
    private List<T> courseList;

    public Course() {
        courseList = new ArrayList<>();
    }

    // Method to add a course to the list
    public void addCourse(T course) {
        courseList.add(course);
    }

    // Method to remove a course from the list
    public void removeCourse(T course) {
        courseList.remove(course);
    }

    // Method to get the list of courses
    public List<T> getCourses() {
        return courseList;
    }

    // Method to display all courses
    public void displayAllCourses() {
        for (T course : courseList) {
            course.displayCourseDetails();
        }
    }
}
