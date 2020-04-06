package com.rahuldhillo.basics;

public class StringFormatting {
    public static void main(String[] args) {
        //Inefficient code as new strings create and stay and fill memory;
        String info = "";
        info += "Hello";
        info += " ";
        info += "Bye";
        System.out.println(info);

        //Efficient as it will change the String content, will not refer to new String.

        StringBuilder sb = new StringBuilder("");
        sb.append("What are you doing?");
        sb.append(" ");
        sb.append("Where wre you?");
        System.out.println(sb.toString());

        //method chain

        StringBuilder s = new StringBuilder();
        s.append("I am here.")
        .append(" ")
        .append("Why where you looking for me?");

        System.out.println(s.toString());

        //Integer formatting, more controlled then string
        System.out.print("Here is some text.\t This is a tab.\nThis is a new line.");
        System.out.println("This is new text.");
        System.out.println("More Text");
        // you will get good padding
        for (int i=0; i<20; i++) {
            System.out.printf("%-5d %s\n", i , "you are reading a text");
        }
        System.out.printf("Total Value is %20.3f", 456.897690);
    }
}
