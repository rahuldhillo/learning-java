package basics.readingfile;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("test.txt");

        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null) {System.out.println(line);}

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }

        finally { //in case this will run, hence important to close br. avoid memory leak.
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file " + file.toString());
            } catch (NullPointerException e) {
                //File was never opened. We will not put any message.
            }
        }
    }
}
