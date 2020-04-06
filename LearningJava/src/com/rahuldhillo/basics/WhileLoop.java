package com.rahuldhillo.basics;

public class WhileLoop{
    public static void main(String[] args){
        int myInt = 0;
        while (myInt <= 5){
            if(myInt < 5){
                System.out.println("I am in if " + myInt);
                if(myInt == 5)
                    break;
            }
            myInt++;
            System.out.println("I am in while " + myInt);
        }
        System.out.println("I am out of while and in main " + myInt);
    }
}
