package basics.scannerread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "/Users/rahul/IdeaProjects/example.txt";
        String fileName = "example.txt";

        File file = new File (fileName);
        Scanner in = new Scanner (file);
        int count = 0;
        while (in.hasNextInt()){
            int num = in.nextInt();
            System.out.println(count + ": " + num);
            count++;
        }

        //for cartage return.
        in.nextLine();

        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }
        in.close();
    }
}
