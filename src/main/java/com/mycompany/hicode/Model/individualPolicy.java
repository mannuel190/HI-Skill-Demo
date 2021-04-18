package com.mycompany.hicode.Model;


import java.util.*;


public class individualPolicy extends Policy {

    
    //Constructor 
    public individualPolicy(){}
    
    public individualPolicy (String hospitalCover,String policyType,String dayToDayExpenses,int policyID){
        super( hospitalCover, policyType, dayToDayExpenses, policyID);
    }
    //To String method
    public String toString() {
        return  super.toString();
    }

    //Calculate premium method
    public float CalculatePremium(Customer customer) {
        return super.CalculatePremium(customer);
    }

    
    

}//End of Main