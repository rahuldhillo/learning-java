package com.rahuldhillo.basics.abstractclass;

public class Car extends Machine{

    @Override
    public void start() {
        System.out.println("car started");
    }

    @Override
    public void doStuff() {
        System.out.println("car stuffing");

    }

    @Override
    public void shutDown() {
        System.out.println("car shutting");

    }
}
