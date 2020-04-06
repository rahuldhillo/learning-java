package com.rahuldhillo.basics.innerclass;

public class Robot {

    private int id;

    private class Brain {
        public void think(){
            System.out.println("Robot" + id + "Is thinking");
        }
    }

    public static class Battery{
        public void charge(){
            System.out.println("Charging..");
        }

    }
    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Robot Started " +id);
        Brain brain = new Brain();
        brain.think();

        final String name = "Robert";

        class Temp{
            public void doSomething(){
                System.out.println("My ID is: " +id);
                System.out.println("My name is: " + name);
            }
        }
        Temp temp = new Temp();
        temp.doSomething();
    }
}
