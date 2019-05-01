package basics.handlingexceptions.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {

        File file =  new File ("test.txt");

        try {
            FileReader fr = new FileReader(file);
            //this will not work as no file.
            System.out.println("Continuing ...");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }
        System.out.println("Finished.");
    }
}
