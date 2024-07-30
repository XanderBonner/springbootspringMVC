package com.jxbapp.springboot.thymeleafdemo.model;

public class Student {

    //instance variables
    private String firstName;
    private String lastName;
    private String country;

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

    //get country
    public String getCountry(){ return country;}

    //set country
    public void setCountry(String country){ this.country = country;}

}
