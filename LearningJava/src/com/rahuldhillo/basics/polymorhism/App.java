package com.rahuldhillo.basics.polymorhism;

public class App {
    public static void main(String[] args) {

        Plant plant = new Plant();
        Tree tree = new Tree();

        Plant plant1 = tree;

        plant.grow();
        plant1.grow();

        tree.shedLeaves();

        //wont work becasue its Plant type
        //plant1.shedleaves();

        doGrow(tree);
    }

    public static void doGrow(Plant plant){
        plant.grow();
    }
}
