package com.rahuldhillo.basics;

class App {
    private String name;
    int code;
    public App(){
        this ("baba", 4);
        System.out.println("App is running first construtor");
        name = "Haha";
    }
    public App(String name){
        this.name = name;
        System.out.println("App is running second constructor");
    }
    public App (String name, int code){
        this.name = name;
        this.code = code;
        System.out.println("App is running third constructor");
    }
}

public class ConstructorCalling{
    public static void main(String[] args){
        App app1 = new App ();
    }
}