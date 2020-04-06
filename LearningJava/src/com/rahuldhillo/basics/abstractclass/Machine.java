package com.rahuldhillo.basics.abstractclass;

public abstract class Machine {
    private int id;

    public int getId(int id){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public abstract void start();
    public abstract void doStuff();
    public abstract void shutDown();

    public void run(){
        start();
        doStuff();
        shutDown();
    }

}

