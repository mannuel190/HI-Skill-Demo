
package com.mycompany.hicode.Model;

import java.util.ArrayList;


public class Test_Corporate_Policy {

    
    public static void main(String[] args) {
    ArrayList<String> Existinghealthcond = new ArrayList<>();    
    Existinghealthcond.add("Kidney");    
        
    Customer michelleHogan = new Customer("Michelle", "Hogan", "Female", "56 to 70 inclusive",Existinghealthcond, "No", "yes" );
    System.out.println(michelleHogan.toString());    
        
    CorporatePolicy michelleHoganCPolicy = new CorporatePolicy("Comprehensive Hospital Cover", "Corporate Policy", "Comprehensive Day to Day Expenses", 1);
    System.out.println(michelleHoganCPolicy.toString()); 
    System.out.println("Insurance Premium: "+michelleHoganCPolicy.CalculatePremium(michelleHogan)+ " \n");
        
        
//    Daniel Kiely
    ArrayList<String> Existinghealthcond2 = new ArrayList<>();    
    Existinghealthcond2.add("None");    
        
    Customer danielKiely = new Customer("Daniel", "Kiely", "Male", "35 to 55 inclusive", Existinghealthcond2, "No", "Yes");
    System.out.println(danielKiely.toString());    
        
    CorporatePolicy danielKielyCPolicy = new CorporatePolicy("Public Hospital", "Corporate Policy", "Standard Day to Day Expenses", 6);
    System.out.println(danielKielyCPolicy);
    System.out.println("Insurance Premium: "+danielKielyCPolicy.CalculatePremium(danielKiely)+ " \n");   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//End of Main
    
}//End of Class
