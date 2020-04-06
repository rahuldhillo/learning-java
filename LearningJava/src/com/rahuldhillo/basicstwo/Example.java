package com.rahuldhillo.basicstwo;

public class Example {
    private int x;
    private static int y;

    public static void fun () {
        // x=0; will not work
        y = 9; // will work
    }

    static class Data {
        public static String country = "India";

        void nofun(){

        }
    }

    static Data data = new Data ();

    public static void main (String [] args){
        Example.y = 9;
        Example.fun();
        System.out.println(Example.Data.country);
        Example.data.nofun();
    }
}
