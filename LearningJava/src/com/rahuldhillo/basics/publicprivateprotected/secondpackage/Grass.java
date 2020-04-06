package com.rahuldhillo.basics.publicprivateprotected.secondpackage;

public class Grass {
    Plant plant1 = new Plant();

    public Grass(Plant plant1) {
        this.plant1 = plant1;
        //will not work
        //System.out.println(plant1.type);
    }
}
