package com.rahuldhillo.basics.trywithresources;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        /*FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);*/

        //we will make the code short. by directly passing object in br declaration.
        try(BufferedReader br = new BufferedReader(new FileReader(file))){ //Java 7 feature.
            String line;
            while((line = br.readLine()) != null) {System.out.println(line);}
        } catch (FileNotFoundException e) {
            System.out.println("Cant find the file " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to open the file  " + file.toString());
        }
    }
}
