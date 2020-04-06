package com.rahuldhillo.basics.abstractclass;

public class App {
    public static void main(String[] args) {
        Camera cam = new Camera ();
        cam.getId(5);

        Car car = new Car();
        car.getId(9);

        //Machine mach = new Machine(); // will not work as Machine is abstract. you cant declare its object.

        car.run();
    }
}
