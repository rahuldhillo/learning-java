package com.rahuldhillo.basics.multipleexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) /*throws IOException, ParseException*/ {
        Test test = new Test();

        //test.run(); // for throws

        //Second way to handle
        /*try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse");
        }*/

        // third way. Multi catch
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        // fourth way. By polymorphism.

        try {
            test.run();
        } catch (Exception e)/*Exception s parent of every Exception (io or parcse etc.)*/ {
            e.printStackTrace();
        }

        //Fifth way. Always put exception in correct hierarchy. child First, else parent will be called and child will get ignored
        try {
            test.input();
        } catch (FileNotFoundException e)/*Will always come first as its a child of IOException.
        In multi catch it will not even allow and will say child is already handled by parent*/ {
            e.printStackTrace();}
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
