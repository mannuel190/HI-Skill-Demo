package com.mycompany.hicode.Model;


import java.util.*;


public class Policy {

    //Instance Variables
    
    private String hospitalCover;
    private String policyType;
    private String dayToDayExpenses; 
    private int policyID;
    private float quote = 200.0f;

    
    //Empty Constructor
    public Policy(){
    }
    
    //Full Constructor
    public Policy(String hospitalCover,String policyType,String dayToDayExpenses,int policyID ){
    this.hospitalCover = hospitalCover;
    this.policyType = policyType;
    this.dayToDayExpenses = dayToDayExpenses;
    this.policyID = policyID;
    }
    
    
    //Methods
    
    //Calvulate remium method to Calculate Insurance Premium
    public float CalculatePremium(Customer customer) {
        
    //If Statement to catch Over 70's 
    if(customer.getage().equalsIgnoreCase("over 70")){
    System.out.println("No Quote for Over 70's");
    quote = -1f;
    }
    
    else{        
    //Gender Calculation
    if(customer.getGender().equalsIgnoreCase("Male"))
        {
        quote = quote* 2.0f;
        }

        else if (customer.getGender().equalsIgnoreCase("Female"))
        {
        quote =  quote * 0.7f;
        }

        //Age Calculation
        if (customer.getage().equalsIgnoreCase("Under 35"))
        {
         quote =  quote * 1.20f;   
        }

        else if (customer.getage().equalsIgnoreCase("35 to 55 inclusive"))
        {
         quote =  quote * 1.40f;   
        }

        else if (customer.getage().equalsIgnoreCase("56 to 70 inclusive"))
        {
         quote =  quote * 1.65f;   
        }




    //start of For Loop and Condition Calculation
    for(int i=0; i < customer.getExistingHealthConditions().size(); i++ ){ 

    if(customer.getExistingHealthConditions().get(i).equals("Bone Marrow"))
        {
            quote = quote * 1.20f;
        }


        else if(customer.getExistingHealthConditions().get(i).equals("Cancer"))
        {
            quote = 1.25f * quote;
        }

        else if(customer.getExistingHealthConditions().get(i).equals("Cardiovascular disease"))
        {
            quote = 1.30f * quote;
        }

        else if (customer.getExistingHealthConditions().get(i).equals("Gastrointestinal"))
        {
            quote = 1.10f * quote;
        }

       else if (customer.getExistingHealthConditions().get(i).equals("Infections"))
        {
            quote = 1.10f * quote;
        }

       else if (customer.getExistingHealthConditions().get(i).equals("Kidney"))
        {
            quote = 1.25f * quote;
        }

        else if(customer.getExistingHealthConditions().get(i).equals("Lungs"))
        {
            quote = 1.25f * quote;
        }

        else if (customer.getExistingHealthConditions().get(i).equals("Muscoskeletal"))
        {
            quote = 1.30f * quote;
        }

    }//End of For Loop




    if (customer.getOtherHealthConditions().equalsIgnoreCase("No"))
        {
            quote = quote;
        }

       else
        {
            quote = quote * 1.50f;
        }

        if(customer.getSmoker().equalsIgnoreCase("Smoker"))
        {
            quote = quote + 75.0f;
        }

        else if(customer.getSmoker().equalsIgnoreCase("Non-Smoker"))
        {
            quote = quote -100.0f;
        }

        if(getHospitalCover().equalsIgnoreCase("Selected Private Hospitals"))
        {
            quote = quote*1.20f;
        }

        else if(getHospitalCover().equalsIgnoreCase("Comprehensive Hospital Cover"))
        {
            quote = quote*1.30f;
        }

        if (getDayToDayExpenses().equalsIgnoreCase("Enhanced Day to Day Expenses"))
        {
            quote = quote *1.20f;
        }

        else if (getDayToDayExpenses().equalsIgnoreCase("Comprehensive Day to Day Expenses"))
        {
             quote = quote *1.30f;       
        }
    }
    return quote;
        
    }
    
    
    //Setter and Getter Methods
    public void setHospitalCover( String hospitalCover) {
        this.hospitalCover = hospitalCover;
    }

    
    public String getHospitalCover() {
        return hospitalCover;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

 
    public String getPolicyType() {
        return policyType;
    }

    
    public void setDayToDayExpenses(String dayToDayExpenses) {
       this.dayToDayExpenses = dayToDayExpenses;
    }

  
    public String getDayToDayExpenses() {
        return dayToDayExpenses;
    }


   
    public void setPolicyID(int policyID) {
        this.policyID = policyID;
    }

    
    public int getPolicyID() { 
        return policyID;
    }

  

    //ToString Method to output policy details to the console
    public String toString() {  
        return 
        "Hospital Cover: " + hospitalCover + "\n" + 
        "Policy Type: " + policyType + "\n" +
        "Day to Day Expenses: " + dayToDayExpenses + "\n"+
        "Existing Health Conditions" + "\n" +"PolicyID: " + policyID ;
    }

}//End Main



