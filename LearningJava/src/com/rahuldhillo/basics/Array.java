package com.rahuldhillo.basics;
import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        System.out.println("enter array length");
        Scanner scanner = new Scanner(System.in);
        int arL = scanner.nextInt();
        int[] values = new int[arL];
        int i = 0;
        int a = 0;
        if (values.length > i){
            System.out.println("enter value for array");
            Scanner scanner2 = new Scanner (System.in);
            values[a] = scanner2.nextInt();
            i++;
            a++;
        }
        else {

        }
    }
}
