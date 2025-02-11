package com.tit.day01javagenerics.multileveluniversitycoursemanagementsystem;


import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingUniversityCourseManagementSystem for testing CourseType and its subclasses
public class TestingUniversityCourseManagementSystem {

    private Course<ExamCourse> examCourses;
    private Course<AssignmentCourse> assignmentCourses;
    private Course<ResearchCourse> researchCourses;

    @BeforeEach
    public void setUp() {
        examCourses = new Course<>();
        assignmentCourses = new Course<>();
        researchCourses = new Course<>();
    }

    @Test
    public void testAddAndRemoveExamCourse() {
        // Creating an exam course
        ExamCourse mathExamCourse = new ExamCourse("Mathematics");

        // Adding the exam course to the list
        examCourses.addCourse(mathExamCourse);
        List<ExamCourse> courses = examCourses.getCourses();
        assertTrue(courses.contains(mathExamCourse));

        // Display courses after addition
        System.out.println("Courses in exam list after adding:");
        examCourses.displayAllCourses();

        // Removing the exam course from the list
        examCourses.removeCourse(mathExamCourse);
        courses = examCourses.getCourses();
        assertFalse(courses.contains(mathExamCourse));

        // Display courses after removal
        System.out.println("Courses in exam list after removing:");
        examCourses.displayAllCourses();
    }

    @Test
    public void testAddAndRemoveAssignmentCourse() {
        // Creating an assignment course
        AssignmentCourse csAssignmentCourse = new AssignmentCourse("Computer Science");

        // Adding the assignment course to the list
        assignmentCourses.addCourse(csAssignmentCourse);
        List<AssignmentCourse> courses = assignmentCourses.getCourses();
        assertTrue(courses.contains(csAssignmentCourse));

        // Display courses after addition
        System.out.println("Courses in assignment list after adding:");
        assignmentCourses.displayAllCourses();

        // Removing the assignment course from the list
        assignmentCourses.removeCourse(csAssignmentCourse);
        courses = assignmentCourses.getCourses();
        assertFalse(courses.contains(csAssignmentCourse));

        // Display courses after removal
        System.out.println("Courses in assignment list after removing:");
        assignmentCourses.displayAllCourses();
    }

    @Test
    public void testAddAndRemoveResearchCourse() {
        // Creating a research course
        ResearchCourse bioResearchCourse = new ResearchCourse("Biology");

        // Adding the research course to the list
        researchCourses.addCourse(bioResearchCourse);
        List<ResearchCourse> courses = researchCourses.getCourses();
        assertTrue(courses.contains(bioResearchCourse));

        // Display courses after addition
        System.out.println("Courses in research list after adding:");
        researchCourses.displayAllCourses();

        // Removing the research course from the list
        researchCourses.removeCourse(bioResearchCourse);
        courses = researchCourses.getCourses();
        assertFalse(courses.contains(bioResearchCourse));

        // Display courses after removal
        System.out.println("Courses in research list after removing:");
        researchCourses.displayAllCourses();
    }

    @Test
    public void testDisplayAllCoursesInUniversity() {
        // Creating courses
        ExamCourse mathExamCourse = new ExamCourse("Mathematics");
        AssignmentCourse csAssignmentCourse = new AssignmentCourse("Computer Science");
        ResearchCourse bioResearchCourse = new ResearchCourse("Biology");

        // Adding courses to respective lists
        examCourses.addCourse(mathExamCourse);
        assignmentCourses.addCourse(csAssignmentCourse);
        researchCourses.addCourse(bioResearchCourse);

        // Display all courses
        System.out.println("Displaying all courses in the university:");
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(mathExamCourse);
        allCourses.add(csAssignmentCourse);
        allCourses.add(bioResearchCourse);

        University.displayAllCourses(allCourses);

        // Assert that the total number of courses is correct
        assertEquals(3, allCourses.size());
    }
}