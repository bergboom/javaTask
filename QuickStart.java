//import java.util.ArrayList;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QuickStart {
    public static void main (String[] args) {
        atm a = new atm(); //cashierMachine
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What is the cost ?");
            // Reading data using readLine
            double productCost = Double.parseDouble(reader.readLine()); //absdfs
            System.out.println("What is the customer paying ?");
            // Reading data using readLine
            double moneyRetrieved = Double.parseDouble(reader.readLine());



            HashMap<String, Integer> changeRetrieved = new HashMap<String, Integer>();
            changeRetrieved = a.getChange(moneyRetrieved, productCost); 
            for(String key: a.getChange(moneyRetrieved, productCost).keySet()){
                if(changeRetrieved.get(key) != 0){
                    System.out.println(key +" : " + changeRetrieved.get(key));
                }
            }
        } catch (IOException e) {
            System.out.println("Erronous input. Please confirm!");
            e.printStackTrace();
        }
        
        
        
        

        
        
        

    
        
        
        
        
        
        
    }
}