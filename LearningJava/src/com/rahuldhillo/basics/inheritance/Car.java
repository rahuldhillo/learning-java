package com.rahuldhillo.basics.inheritance;

public class Car extends Machine {

    public void windShiled(){
        System.out.println("Windshield Started");
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }
    /*public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }*/
    // this would not work. Name is private.
    /*public void showInfo(){
        System.out.println("Car is: " name);
    }/*
     */

    public void showInfo(){
        System.out.println(name2);
    }
}
