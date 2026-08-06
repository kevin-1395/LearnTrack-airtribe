package com.airtribe.learntrack.entity;

public class Enrollment {

    private int id;
    private int studentId;
    private int courseId;
    private String enrollmentDate;
    private String status;

    //Parameterized Constructor
    Enrollment(int id, int studentId, int courseId, String enrollmentDate, String status){
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    //getters
    public int getId(){
        return id;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getCourseId(){
        return courseId;
    }

    //setters

    public void setId(int id){
        this.id = id;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public void setCourseId(int courseId){
        this.courseId = courseId;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
