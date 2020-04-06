package com.rahuldhillo.basics.genericclass;

import java.util.ArrayList;
import java.util.HashMap;

class animal {

}

public class App {
    public static void main(String[] args) {
        //Old style. Before Java 5.

        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");
        //Typcasted object which was returned.
        String fruit = (String)list.get(1);
        System.out.println(fruit);

        //Modern Style

        ArrayList<String> someString = new ArrayList<String>();

        someString.add("cat");
        someString.add("dog");
        someString.add("camel");
        String animal = someString.get(1);
        System.out.println(animal);

        //Can use more than one parameter.

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //Java 7 Style

        ArrayList<animal> someList = new ArrayList<>();
    }
}
