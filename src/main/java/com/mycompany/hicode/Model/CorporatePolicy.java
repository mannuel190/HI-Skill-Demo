package com.mycompany.hicode.Model;


import java.util.*;


public class CorporatePolicy extends Policy {

  //Instance Variables
  private float corporateDiscount;

   
  //Constructors
  public CorporatePolicy(){}
  
  public CorporatePolicy (String hospitalCover,String policyType,String dayToDayExpenses,int policyID){
  super( hospitalCover, policyType, dayToDayExpenses, policyID);
  }

    
  //Methods

  //Calculate premium Method
  public float CalculatePremium(Customer customer) {
       return (super.CalculatePremium(customer)*90)/100;
    }

    
    
   
    @Override
    //ToString Method to output policy information to console window
    public String toString(){
        return super.toString();
       
    }
    

}//End of Main