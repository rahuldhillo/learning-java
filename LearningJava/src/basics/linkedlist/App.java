package basics.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); //arrayList is faster at the end
        LinkedList<Integer> linkediList = new LinkedList<Integer>(); // linkedList is faster elsewhere.

        //another way
        //List<Integer> arrayList = new ArrayList<Integer>(); //you can use interface while declaring.
        //List<Integer> linkediList = new LinkedList<Integer>();// only have to care in new section about the type of list.

        doTimings("Array", arrayList);
        doTimings("LinkedList", linkediList);

    }

    private static void doTimings(String type, List<Integer> list){ //interface magic. abstraction.
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        /*
        // Add items at end of list
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        */

        // Add items elsewhere in list
        for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }

}
