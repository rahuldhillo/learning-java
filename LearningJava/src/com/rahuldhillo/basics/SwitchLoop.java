package com.rahuldhillo.basics;

import java.util.Scanner;

public class SwitchLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        switch (text){
            case "start":
            System.out.println("started");
            break;

            case "stop":
            System.out.println("stop");
            break;

            default:
                System.out.println("default");

        }

    }
}
