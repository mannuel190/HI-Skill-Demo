package com.mycompany.hicode.Model;


import java.util.*;


public class Customer {
    
    //Instance Variables
    private String firstName;
    private String lastName;
    private String gender;
    private String age;
    private ArrayList existingHealthConditions;
    private String otherHealthConditions;
    private String smoker;
   
    
    //Empty Constructor
    public Customer(){}
    
    //Full Constructor
    public Customer(String firstName, String lastName, String gender, String age, 
    ArrayList existingHealthConditions, String otherHealthConditions,
    String smoker) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.age = age;
    this.existingHealthConditions = existingHealthConditions;
    this.otherHealthConditions = otherHealthConditions;
    this.smoker = smoker;
    
    }

    //Setter and Getter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }

   
    public String getGender() {
        return gender;
    }

    
    public void setAge(String age) {
        this.age = age;
    }

    
    public String getage() {
        
        return age;
    }

   
    public void setExistingHealthConditions(ArrayList existingHealthConditions) {
        this.existingHealthConditions = existingHealthConditions;
    }

   
    public ArrayList getExistingHealthConditions() {
        return existingHealthConditions;
    }

    
    public void setOtherHealthConditions(String otherHealthConditions) {
        this.otherHealthConditions = otherHealthConditions;
    }

    
    public String getOtherHealthConditions() {
        return otherHealthConditions;
    }

   
    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    
    public String getSmoker() {
        return smoker;
    }

   //toString method to display customer information to console window
    @Override
    public String toString() {
        
        
        return 
        "First Name: " + firstName + "\n" + 
        "Last Name: " + lastName + "\n" +
        "Gender: " + gender + "\n"+
        "Age: " + age + "\n" +
        "Existing Health Conditions" + existingHealthConditions + "\n" +
        "Other Health Conditions: " + otherHealthConditions + "\n" +
        "Smoker: " + smoker + "\n";
        
    }

}//End of main method