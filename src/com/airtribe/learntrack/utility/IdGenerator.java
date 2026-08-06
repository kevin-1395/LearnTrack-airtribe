package com.airtribe.learntrack.utility;

public class IdGenerator {

    // static variable and Methods declaration

    private static int studentCounter;
    private static int courseCounter;

    public static int getStudentId(){
        return studentCounter+1;
    }

    public static int getCourseId(){
        return courseCounter+1;
    }
}
