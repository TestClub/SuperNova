package UseOfArray;

import java.util.ArrayList;
import java.util.List;

public class UseOfArrayList {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        List<String> myList1 = new ArrayList<String>();
        myList.add("Name");
        myList1.add("Subhra");
        myList.add("ID");
        myList1.add("101");
        myList.add("DOB");
        myList1.add("01/01/1988");

        for (String print:myList) {
            System.out.println(print + " ");

                System.out.println(myList1);
        }

    List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        System.out.println(list.size());
        for (Integer value:list) {
            System.out.println("This is the " + value);


        }
        }

    }

