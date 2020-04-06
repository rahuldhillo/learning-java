package com.rahuldhillo.basics;

class Frog3 {

    private int id;
    private String name;

    public Frog3 (int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString() {

        return String.format("%-5d: %s", id, name);

        //StringBuilder sb =  new StringBuilder();
        //sb.append (id).append(": ").append(name);
        //return sb.toString();
        //return id + ": " + name;
    }
}

public class ToString {
    public static void main(String[] args) {
        Frog3 frog1 = new Frog3 (7, "Fred");
        System.out.println(frog1);
    }
}
