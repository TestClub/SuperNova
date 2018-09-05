package DataStructure;

import java.util.LinkedHashMap;

import java.util.Map;

public class UseOfMap {
    public static void main(String[] args) {
        Map<String , Integer > Students = new LinkedHashMap<>();
        Students.put("Subhra" ,100);
        Students.put("Roy" , 101);
        Students.put("Sabuz" ,102);
        Students.put("Robin" , 104);
        for (Map.Entry<String, Integer> state:Students.entrySet()){

            System.out.println(state.getKey()+ "=======>>>>>" + state.getValue());

        }



    }
}
