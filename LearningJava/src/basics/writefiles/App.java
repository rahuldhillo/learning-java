package basics.writefiles;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("test1.txt");
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){ //will call br.close automatically.
            br.write("First line\n");
            br.write("Second line\n");
            br.write("Third line\n");
        } catch (IOException e) {
            System.out.println("Unable to open the file  " + file.toString());
        }
    }
}
