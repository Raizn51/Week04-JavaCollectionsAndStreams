package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise5repeatableannotation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingBugTracker to test BugTracker class and the repeatable annotation
class TestingBugTracker {

    // Test method for processBugs() with @BugReport annotation
    @Test
    void testProcessBugsAnnotations() throws Exception {
        // Retrieve annotation details using Reflection API
        Method method = BugTracker.class.getMethod("processBugs");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        // Expected annotation descriptions
        List<String> expectedDescriptions = Arrays.asList("Null pointer exception", "Array index out of bounds");

        // Collect actual annotation descriptions
        List<String> actualDescriptions = Arrays.stream(bugReports)
                .map(BugReport::description)
                .collect(Collectors.toList());

        // Asserting the annotation descriptions
        assertEquals(expectedDescriptions, actualDescriptions);
    }
}
