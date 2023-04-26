//import java.util.ArrayList;
import java.util.HashMap;

public class atm {
    HashMap<String, Integer> changeMap = new HashMap<String, Integer>();
    Integer[] billTypes = {100,50,20,10,5,2,1,0};

    public HashMap<String, Integer> getChange(Double insertedMoney, Double cost){
        
        Double remaining = insertedMoney -cost;

        double bitsAndBobs = remaining - remaining.intValue() ;
        if (bitsAndBobs >= 0.5)
            changeMap.put("0.5",1);

        if(remaining > 0){
            for(Integer x: billTypes){ //Note: billTypes has to be in order. 0 = 0.5
                remaining = GetChangeByBillType(x, remaining).doubleValue();
                if(remaining <= 0)
                    break;
            }
            return(changeMap);
        }
        else{
            changeMap.put("Missing money", 0);
            System.out.println("We have retrieved to little money!!");
            return(changeMap);
        }
    }

    public Integer GetChangeByBillType(Integer billType, Double moneyToChange){ //Return rest
            int rest = moneyToChange.intValue() % billType;
            changeMap.put(billType.toString(),((moneyToChange.intValue()-rest)/billType));
            return rest;
    }
    
}
