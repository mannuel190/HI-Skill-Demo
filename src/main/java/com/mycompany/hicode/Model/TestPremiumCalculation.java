
package com.mycompany.hicode.Model;

import java.util.ArrayList;


public class TestPremiumCalculation {

    
    public static void main(String[] args) {
        
//    Michelle Hogan
    ArrayList<String> Existinghealthcond = new ArrayList<>();    
    Existinghealthcond.add("Kidney");
    
    Customer michelleHogan = new Customer("Michelle", "Hogan", "Female", "56 to 70 inclusive",Existinghealthcond, "No", "yes" );
    System.out.println(michelleHogan.toString());
    
    Policy michelleHoganPolicy = new Policy("Comprehensive Hospital Cover", "Corporate Policy", "Comprehensive Day to Day Expenses", 1);
    System.out.println(michelleHoganPolicy.toString());   
    System.out.println("Insurance Premium: "+michelleHoganPolicy.CalculatePremium(michelleHogan)+ " \n");
    
    
    //Paddy Doyle Test
    ArrayList<String> Existinghealthcond1 = new ArrayList<>();    
    Existinghealthcond1.add("Bone Marrow");
    Existinghealthcond1.add("Lungs");
    
    Customer paddyDoyle = new Customer ("Paddy", "Doyle", "Male", "Under 35", Existinghealthcond1, "No", "Yes");
    System.out.println(paddyDoyle.toString());
    
    Policy paddyDoylePolicy = new Policy("Public Hospital","Individual Policy","Standard",2);
    System.out.println(paddyDoylePolicy.toString());
    System.out.println("Insurance Premium: "+paddyDoylePolicy.CalculatePremium(paddyDoyle)+ " \n");
    
    
    //pATRICIA Folan
    ArrayList<String> Existinghealthcond2 = new ArrayList<>();    
    Existinghealthcond2.add("None");
    
    Customer patriciaFolan = new Customer("Patricia", "Folan", "Female", "35 to 55 inclusive", Existinghealthcond2, "Yes", "No");
    System.out.println(patriciaFolan.toString());
    
    Policy patriciaFolanPolicy = new Policy("Comprehensive Hospital Cover", "Individual Policy", "Enhanced", 3);
    System.out.println(patriciaFolanPolicy.toString());
    System.out.println("Insurance Premium: "+patriciaFolanPolicy.CalculatePremium(patriciaFolan)+ " \n");
    
    
    //Donal Russell
    ArrayList<String> Existinghealthcond3 = new ArrayList<>();    
    Existinghealthcond3.add("Cancer");
    
    Customer donalRussell = new Customer("Donal", "Russell", "Male", "Under 35", Existinghealthcond3, "No", "No");
    System.out.println(donalRussell.toString());
    
    Policy donalRussellPolicy = new Policy("Selected Private Hospitals","Individual Policy","Standard Day to Day Expenses", 4);
    System.out.println(donalRussellPolicy.toString());
    System.out.println("Insurance Premium: "+donalRussellPolicy.CalculatePremium(donalRussell)+ " \n");
    
    
    //Chuck Norris
    ArrayList<String> Existinghealthcond4 = new ArrayList<>();    
    Existinghealthcond4.add("Infections");
    Existinghealthcond4.add("Kidney");
    
    Customer chuckNorris = new Customer("Chuck", "Norris", "Male", "Under 35", Existinghealthcond4, "Yes", "No");
    System.out.println(chuckNorris.toString());
    
    Policy chuckNorrisPolicy = new Policy ("Selected Private Hospitals", "Individual Policy", "Enhanced", 5);   
    System.out.println(chuckNorrisPolicy.toString());
    System.out.println("Insurance Premium: "+chuckNorrisPolicy.CalculatePremium(chuckNorris)+ " \n");
    
    //Daniel Kiely
    Customer danielKiely = new Customer("Daniel", "Kiely", "Male", "35 to 55 inclusive", Existinghealthcond2, "No", "Yes");
    System.out.println(danielKiely.toString());
    
    Policy danielKielyPolicy = new Policy("Public Hospital", "Corporate Policy", "Standard Day to Day Expenses", 6);
    System.out.println(danielKielyPolicy);
    System.out.println("Insurance Premium: "+danielKielyPolicy.CalculatePremium(danielKiely)+ " \n");
    
    }//End Class
    
}//End Main
