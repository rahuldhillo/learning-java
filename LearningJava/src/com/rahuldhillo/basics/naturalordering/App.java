package com.rahuldhillo.basics.naturalordering;

import java.util.*;

class Person implements Comparable<Person>{
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name is: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int compareTo(Person person){
        int len1 = name.length();
        int len2 = person.name.length();

        if (len1<len2){
            return 1;
        }else if (len1>len2){
            return -1;
        }
        return name.compareTo(person.name);
    }
}


public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Set<String> set = new TreeSet<String>();
        SortedSet<String> set1 = new TreeSet<String>();

        addElements(list);
        showElements(list);

        System.out.println();

        addElements(set);
        showElements(set);

        System.out.println();

        addElements(set1);
        showElements(set1);

        System.out.println();

        //Person List
        List<Person> personList = new ArrayList<Person>();
        SortedSet<Person> personSet = new TreeSet<Person>();

        addPersonElements(personList);
        showPersonElements(personList);

        System.out.println();

        addPersonElements(personSet);
        showPersonElements(personSet);

    }

    private static void addElements(Collection<String> col){
        col.add("Joe");
        col.add("Sue");
        col.add("Bue");
        col.add("Mue");
        col.add("Zue");
        col.add("Tue");
    }

    private static void showElements(Collection<String> col){
        for (String string: col){
            System.out.println(string);
        }
    }

    private static void addPersonElements(Collection<Person> col){
        col.add(new Person("Joe"));
        col.add(new Person ("Sue"));
        col.add(new Person ("Bue"));
        col.add(new Person("Mue"));
        col.add(new Person("Zue"));
        col.add(new Person ("Tue"));
    }

    private static void showPersonElements(Collection<Person> col){
        for (Person person: col){
            System.out.println(person);
        }
    }
}
