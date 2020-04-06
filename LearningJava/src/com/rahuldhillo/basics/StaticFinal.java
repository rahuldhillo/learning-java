package com.rahuldhillo.basics;

class StaticF{
    public String name;
    public static String address;
    public static int count = 0;
    public int id;
    public StaticF(){
        id = count;
        count ++;
    }
    public void showName(){
        System.out.println(name + "and " + address + "and the id is " + id);
    }
    public static void showInfo(){
        System.out.println(address);
    }
}

public class StaticFinal{
    public static void main(String[] args){
        StaticF obj1 = new StaticF();
        StaticF obj2 = new StaticF();
        obj1.name = "Some Name";
        System.out.println(obj1.name);
        obj1.address = "Some address";
        System.out.println(obj1.address);
        StaticF.address = "Some other address";
        System.out.println(obj1.address);
        obj1.showName();
        obj2.showName();
    }
}