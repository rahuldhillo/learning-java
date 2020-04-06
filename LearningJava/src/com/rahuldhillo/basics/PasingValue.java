package com.rahuldhillo.basics;
import java.util.Scanner;

class LetsDoSomething{
    public void Greetings(String text){
        System.out.println(text);
    }
    public int Jump (int height){
        return height;
    }
    public void Direction (String direction, double miles){
        System.out.println("You are going in " + direction + "for miles "+ miles);
    }
}

public class PasingValue{
    public static void main(String[] args) {
        LetsDoSomething object = new LetsDoSomething();
        Scanner enterString = new Scanner(System.in);
        System.out.println("Enter Greetings");
        String greetings = enterString.nextLine();
        object.Greetings(greetings);
        object.Direction("West ", 5);
        int height = object.Jump(7);
        System.out.println("Height is " + height);
    }
}
