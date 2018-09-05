package DataStructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseHashMapWithList {
    public static void main(String[] args) {
        List<String> NameOfSports= new ArrayList<String>();
        NameOfSports.add("Cricket");
        NameOfSports.add("Soccer");
        NameOfSports.add("American Football");
        NameOfSports.add("Tennis");
        NameOfSports.add("Basket ball");


        List<String> NameOfCity = new ArrayList<String>();
        NameOfCity.add("NY");
        NameOfCity.add("Dhaka");
        NameOfCity.add("FL");
        NameOfCity.add("London");




        Map<String,List<String>> WhoPlaysWhat = new LinkedHashMap<String, List<String>>();
        WhoPlaysWhat.put("USA" , NameOfSports);
        WhoPlaysWhat.put("Bangladesh", NameOfSports);
        WhoPlaysWhat.put("India", NameOfSports);

        for (Map.Entry<String, List<String>> state:WhoPlaysWhat.entrySet()){

         if (WhoPlaysWhat.get("USA").contains("Cricket")){
             System.out.println(state.getKey() + "=====" + state.getValue());
         }
        }


    }
}
