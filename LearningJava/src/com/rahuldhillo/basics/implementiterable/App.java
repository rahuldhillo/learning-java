package com.rahuldhillo.basics.implementiterable;

public class App {
    public static void main(String[] args) {

        UrlLibrary2 urllibrary = new UrlLibrary2();

        for (String html: urllibrary) {
            System.out.println(html.length());
            System.out.println(html);
        }

    }
}
