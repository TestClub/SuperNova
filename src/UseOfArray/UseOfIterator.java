package UseOfArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterator {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(12);
        myList.add(13);
        myList.add(14);
        myList.add(15);

        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
