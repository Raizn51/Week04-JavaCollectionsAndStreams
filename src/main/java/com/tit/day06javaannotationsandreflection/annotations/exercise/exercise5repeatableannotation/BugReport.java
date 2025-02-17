package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise5repeatableannotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the repeatable annotation @BugReport with a description field
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

