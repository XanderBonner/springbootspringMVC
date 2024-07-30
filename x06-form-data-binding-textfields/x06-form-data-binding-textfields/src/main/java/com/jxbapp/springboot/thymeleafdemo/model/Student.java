package com.jxbapp.springboot.thymeleafdemo.model;

public class Student {

    //instance variables
    private String firstName;
    private String lastName;

    //empty constructor
    public Student(){
    }

    //need getter and setter methods

    //get FirstName
    public String getFirstName(){
        return firstName;
    }

    //Set firstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //get lastName
    public String getLastName(){
        return lastName;
    }

    //set lastName
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
