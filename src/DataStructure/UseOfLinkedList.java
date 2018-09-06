package DataStructure;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseOfLinkedList {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<String>();
        myList.add("USA");
        myList.add("Bangladesh");
        myList.add("India");
        myList.add("Brazil");

        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String st:myList) {
            System.out.println(st);

        }
        int x = 0;
        do {

            System.out.println("This is the list of countries " + myList);

        }while (x > 5);

        }
    }

