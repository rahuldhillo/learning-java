package com.rahuldhillo.basics;

class Person {
    int age;
    String name;

    /* void speak(){
        System.out.println("This is my name " + name + " and this is my age " + age);
    }*/

    int calculateRetirementAge(){
        int yearLeft = 65 - age;
        return yearLeft;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}

public class Getter{
    public static void main(String[] args){
        Person person1 = new Person ();
        person1.name = "John";
        person1.age = 24;

        //person1.speak();
        int year = person1.calculateRetirementAge();
        System.out.println("Year left for retirement are " + year);
        String name = person1.getName();
        int age = person1.getAge();
        System.out.println("This is my name " + name + " and this is my age " + age);
    }
}
