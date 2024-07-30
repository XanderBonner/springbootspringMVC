package com.jxbapp.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {

    //instance variables
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystems; //students can have more than one favorite systems

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

    //get Language
    public String getFavoriteLanguage(){ return favoriteLanguage;}

    //set Language
    public void setFavoriteLanguage(String favoriteLanguage){ this.favoriteLanguage = favoriteLanguage; }

    //get System
    public List<String> getFavoriteSystems(){return favoriteSystems; }

    //set System
    public void setFavoriteSystems(List<String> favoriteSystems){
        this.favoriteSystems = favoriteSystems;
    }


}
