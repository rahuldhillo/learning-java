package com.rahuldhillo.basics.publicprivateprotected.secondpackage;

public class Plant {
    // Bad Practise
    public String name;

    //Acceptable Practise
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant (){
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";

        this.height = 8;
    }
}
