package com.mycompany.hicode.Model;

import java.util.ArrayList;


public class TestCustomer {

    
    public static void main(String[] args) {
    
    ArrayList<String> Existinghealthcond = new ArrayList<>();    
    Existinghealthcond.add("Kidney");
    
    ArrayList<String> Existinghealthcond1 = new ArrayList<>();    
    Existinghealthcond1.add("boneMarrow");
    Existinghealthcond1.add("Lungs");
 
    ArrayList<String> Existinghealthcond2 = new ArrayList<>();    
    Existinghealthcond2.add("None");

    ArrayList<String> Existinghealthcond3 = new ArrayList<>();    
    Existinghealthcond3.add("Cancer");
    
    ArrayList<String> Existinghealthcond4 = new ArrayList<>();    
    Existinghealthcond4.add("Infections");
    Existinghealthcond4.add("Kidneys");
    
 Customer michelleHogan = new Customer("Michelle", "Hogan", "Female", "56 to 70 inclusive",Existinghealthcond, "No", "Yes" );
 System.out.println(michelleHogan.toString());
 
 
 Customer paddyDoyle = new Customer ("Paddy", "Doyle", "Male", "Under 35", Existinghealthcond1, "No", "Yes");
 System.out.println(paddyDoyle.toString());


 Customer patriciaFolan = new Customer("Patricia", "Folan", "Female", "35 to 55 inclusive", Existinghealthcond2, "Yes", "No");
 System.out.println(patriciaFolan.toString());
 
 
 Customer donalRussell = new Customer("Donal", "Russell", "Male", "Under 35", Existinghealthcond3, "No", "No");
 System.out.println(donalRussell.toString());
 
 
 Customer chuckNorris = new Customer("Chuck", "Norris", "Male", "Under 35", Existinghealthcond4, "Yes", "No");
 System.out.println(chuckNorris.toString());
 
 
 Customer danielKiely = new Customer("Daniel", "Kiely", "Male", "35 to 55 inclusive", Existinghealthcond2, "No", "Yes");
System.out.println(danielKiely.toString());
        







    }//End of Main
    
}//End of Class
