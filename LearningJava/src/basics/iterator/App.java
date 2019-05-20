package basics.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        list.add("Dog");
        list.add("Cat");
        list.add("Mouse");
        list.add("Lion");

        //Modern way to iterate. // cant add or remove items while iterating.
        for(String string: list){
            System.out.println(string);
        }

        System.out.println();


        //Before Java 5. way of iterations.

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String value = it.next();
            if (value.equals("Cat")){
                it.remove();
            }
            System.out.println(value);
        }
        System.out.println(list);

    }
}
