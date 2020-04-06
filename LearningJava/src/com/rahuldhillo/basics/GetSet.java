package com.rahuldhillo.basics;

class Frog{
    private String name;
    private int age;

    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setInfo(String name, int age){
        setAge(age);
        setName(name);
    }
}

public class GetSet{
    public static void main(String[] args){
        Frog frog1 = new Frog ();
        frog1.setAge(7);
        frog1.setName("Binni");
        frog1.setInfo("Ruddy", 5);
        System.out.println("The age is " + frog1.getAge() + " and name is " + frog1.getName());
    }
}
