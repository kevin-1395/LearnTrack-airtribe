package com.airtribe.learntrack.entity;

public class Student extends Person{
    private String batch;
    private boolean active;

    // SUPER() constructor. Parent has parameterized constructor.
    public Student(int id, String firstName, String lastName, String email,
                   String batch, boolean active){
        super(id,firstName,lastName,email);
        this.batch = batch;
        this.active = active;
    }

    //getters

    public String getBatch(){
        return batch;
    }

    public boolean isActive(){
        return active;
    }

    //setters

    public void setBatch(String batch){
        this.batch = batch;
    }

    public void setActive(boolean active){
        this.active = active;
    }


    // Method overriding
    @Override
    public String getDisplayName() {
        return "Student: " + firstName + " " + lastName;
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", batch='" + batch + '\'' +
                ", active=" + active +
                '}';
    }
}
