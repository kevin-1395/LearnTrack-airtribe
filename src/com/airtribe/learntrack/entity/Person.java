package com.airtribe.learntrack.entity;

public class Person {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String email;

    public Person(int id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getId(){
        return id;
    }

    public String getEmail(){
        return email;
    }

    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // Method to demonstrate polymorphism
    public String getDisplayName() {
        return firstName + " " + lastName;
    }

}
