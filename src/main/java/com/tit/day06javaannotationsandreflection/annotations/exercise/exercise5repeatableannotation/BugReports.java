package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise5repeatableannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the container annotation for repeating BugReport annotations
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports
{
    BugReport[] value();
}

