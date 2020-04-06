package com.rahuldhillo.basics.upcasting;

class Machine{
    public void start (){
        System.out.println("Machine started.");
    }
}

class Camera extends Machine{
    public void start (){
        System.out.println("Camera started.");
    }
    public void snap (){
        System.out.println("Photo clicked");
    }
}

public class App {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Camera camera = new Camera();

        machine.start();
        camera.start();
        camera.snap();

        //Upcasting
        Machine machine2 = new Camera();
        //Upcasted
        Machine machine3 = camera;
        machine2.start();
        machine3.start();

        //Downcasting
        Machine machine4 = new Camera();
        Camera camera2 = (Camera)machine4;
        camera2.snap();
        camera2.start();

        //this wont work.
        Machine machine5 = new Machine();
        //Camera camera3 = (Camera) machine5;
        //camera3.start();
        //camera3.snap();
    }
}

