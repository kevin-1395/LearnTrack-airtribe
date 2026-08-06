package com.airtribe.learntrack.entity;

public class Course {

    private int id;
    private String courseName;
    private String description;
    private int durationInWeeks;
    private boolean active;

    //Parameterized Constructor
    Course(int id, String courseName, String description, int durationInWeeks, boolean active){
        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.active = active;
    }

    //getters
    public int getId()
    {
        return id;
    }

    public String getCourseName(){
        return courseName;
    }

    public boolean isActive(){
        return active;
    }

    //setters

    public void setId(int id){
        this.id = id;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setActive(boolean active){
        this.active = active;
    }
}
