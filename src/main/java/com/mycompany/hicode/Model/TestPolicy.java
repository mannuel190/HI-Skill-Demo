
package com.mycompany.hicode.Model;


public class TestPolicy {

   
    public static void main(String[] args) {
        
     Customer chuckNorris = new Customer();   
       
     Policy michelleHoganPolicy = new Policy("Comprehensive Hospital Cover", "Corporate Policy", "Comprehensive Day to Day Expenses", 1);
     System.out.println(michelleHoganPolicy.toString());   
        
     Policy paddyDoylePolicy = new Policy("Public Hospital","Individual Policy","Standard Day to Day Expenses",2);
     System.out.println(paddyDoylePolicy.toString());   
        
     Policy patriciaFolanPolicy = new Policy("Comprehensive Hospital Cover", "Individual Policy", "Enhanced Day to Day Expenses", 3);
     System.out.println(patriciaFolanPolicy.toString());
     
     Policy donalRussellPolicy = new Policy("Selected Private Hospitals","Individual Policy","Standard Day to Day Expenses", 4);
     System.out.println(donalRussellPolicy.toString());
        
     Policy chuckNorrisPolicy = new Policy ("Selected Private Hospitals", "Individual Policy", "Enhanced", 5);   
     System.out.println(chuckNorrisPolicy.toString());
     System.out.println(chuckNorrisPolicy.CalculatePremium(chuckNorris));
     
     
     Policy danielKielyPolicy = new Policy("Public Hospital", "Corporate Policy", "Standard Day to Day Expenses", 6);
     System.out.println(danielKielyPolicy);
     
    }//End of Main
    
}//End of Class
