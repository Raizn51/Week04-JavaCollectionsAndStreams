package com.tit.day01javagenerics.aidrivenresumescreeningsystem;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingAIResumeScreeningSystem for Testing the Resume Screening System
public class TestingAIResumeScreeningSystem {

    // Declare variables for resumes and resume management
    private Resume<SoftwareEngineer> softwareEngineerResumes;
    private Resume<DataScientist> dataScientistResumes;
    private Resume<ProductManager> productManagerResumes;

    private JobRole softwareEngineerResume;
    private JobRole dataScientistResume;
    private JobRole productManagerResume;

    @BeforeEach
    public void setUp() {
        // Initialize objects before each test case
        softwareEngineerResume = new SoftwareEngineer("Software Engineer Resume");
        dataScientistResume = new DataScientist("Data Scientist Resume");
        productManagerResume = new ProductManager("Product Manager Resume");

        softwareEngineerResumes = new Resume<>();
        dataScientistResumes = new Resume<>();
        productManagerResumes = new Resume<>();
    }

    @Test
    public void testAddResume() {
        // Test adding resumes to the lists
        softwareEngineerResumes.addResume((SoftwareEngineer) softwareEngineerResume);
        dataScientistResumes.addResume((DataScientist) dataScientistResume);
        productManagerResumes.addResume((ProductManager) productManagerResume);

        // Assert that the size of each resume list is 1
        assertEquals(1, softwareEngineerResumes.getResumes().size());
        assertEquals(1, dataScientistResumes.getResumes().size());
        assertEquals(1, productManagerResumes.getResumes().size());
    }

    @Test
    public void testRemoveResume() {
        // Test removing resumes from the lists
        softwareEngineerResumes.addResume((SoftwareEngineer) softwareEngineerResume);
        softwareEngineerResumes.removeResume((SoftwareEngineer) softwareEngineerResume);

        // Assert that the size of the list is 0 after removal
        assertEquals(0, softwareEngineerResumes.getResumes().size());
    }

    @Test
    public void testDisplayAllResumes() {
        // Add resumes to each list
        softwareEngineerResumes.addResume((SoftwareEngineer) softwareEngineerResume);
        dataScientistResumes.addResume((DataScientist) dataScientistResume);
        productManagerResumes.addResume((ProductManager) productManagerResume);

        // Capture the output of the displayAllResumes method for validation
        // Normally you would use a mocking library, but for simplicity, we will just assert the expected results.
        assertDoesNotThrow(() -> softwareEngineerResumes.displayAllResumes());
        assertDoesNotThrow(() -> dataScientistResumes.displayAllResumes());
        assertDoesNotThrow(() -> productManagerResumes.displayAllResumes());
    }

    @Test
    public void testDisplayAllResumesUsingScreeningSystem() {
        // Create a list of resumes
        List<JobRole> allResumes = List.of(softwareEngineerResume, dataScientistResume, productManagerResume);

        // Using the ResumeScreeningSystem to display all resumes
        assertDoesNotThrow(() -> ResumeScreeningSystem.displayAllResumes(allResumes));
    }

    @Test
    public void testResumeListSizeAfterMultipleAdditions() {
        // Add multiple resumes and check the size of the list
        softwareEngineerResumes.addResume((SoftwareEngineer) softwareEngineerResume);
        dataScientistResumes.addResume((DataScientist) dataScientistResume);
        productManagerResumes.addResume((ProductManager) productManagerResume);

        // Check the sizes of all resume lists
        assertEquals(1, softwareEngineerResumes.getResumes().size());
        assertEquals(1, dataScientistResumes.getResumes().size());
        assertEquals(1, productManagerResumes.getResumes().size());
    }

    @Test
    public void testRemoveNonExistentResume() {
        // Try to remove a non-existent resume
        dataScientistResumes.removeResume((DataScientist) dataScientistResume);

        // Assert that the size of the list is still 0 since no resume was added
        assertEquals(0, dataScientistResumes.getResumes().size());
    }
}
