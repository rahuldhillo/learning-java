package com.rahuldhillo.hackerrankex;
import java.util.Scanner;

public class JavaOutputFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        //System.out.println("Enter Number of Column");
        for (int int2 = scanner.nextInt(); int2>0; int2--) {
            //System.out.println("Enter String");
            scanner.nextLine();
            String str = scanner.nextLine();
            //System.out.println("Enter integer");
            int int1 = scanner.nextInt();
            int i = str.length();
            if (i < 10 && int1 > 0 && int1 < 999) {
                System.out.printf("%-15s%03d%n", str, int1);
            }
        }
        System.out.println("================================");
    }
}
