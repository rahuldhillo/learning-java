package com.rahuldhillo.basics.publicprivateprotected.firstpackage;

import com.rahuldhillo.basics.publicprivateprotected.secondpackage.Oak;
import com.rahuldhillo.basics.publicprivateprotected.secondpackage.Plant;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant ();
        Oak oak = new Oak ();
        System.out.println(plant.name);
        System.out.println(plant.ID);
        //this wont work. type is private
        //System.out.println(plant.type);
        //wont work. size is protected
        //System.out.println(plant.size);
        //System.out.println(oak.size);
        //height is default
        //System.out.println(plant.height);
    }
}
