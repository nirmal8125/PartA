package com.example.di;

public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student is enrolled in: " + course.getCourseName());
    }
}
