package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise4customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation @TaskInfo with fields priority and assignedTo
@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

