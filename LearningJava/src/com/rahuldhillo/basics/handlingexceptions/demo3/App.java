package com.rahuldhillo.basics.handlingexceptions.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        try {
            openFile();
        } catch (FileNotFoundException e) {
            //Do not include vague message.
            System.out.println("File is not present.");
        }
    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);

    }
}