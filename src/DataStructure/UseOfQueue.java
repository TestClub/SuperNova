package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("Bangladesh");
        queue.add("England");
        queue.add("USA");

        for (String st:queue) {
            System.out.println(st);

        }
    }
}
