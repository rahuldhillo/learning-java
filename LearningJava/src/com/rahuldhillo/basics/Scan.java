package com.rahuldhillo.basics;
import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter something");
        String line = input.nextLine();
        System.out.println("You have entered " + line);
    }
}
