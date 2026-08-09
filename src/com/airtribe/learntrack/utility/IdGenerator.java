package com.airtribe.learntrack.utility;

public class IdGenerator {

    // static variable and Methods declaration

    private static int studentIdCounter = 1;
    private static int courseIdCounter =1;
    private static int enrollmentIdCounter = 1;

    //Next Student ID
    public static int getStudentIdCounter(){
        return studentIdCounter++;
    }

    //Next Course ID
    public static int getNextCourseId(){
        return courseIdCounter++;
    }

    //Next Enrollement ID
    public static int getEnrollmentIdCounter(){
        return enrollmentIdCounter++;
    }
}
