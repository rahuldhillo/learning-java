package basics.arrayserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading Objects...");

        try (FileInputStream fi = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fi)) {


            Person[] people = (Person[])os.readObject();

            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

            for (Person person: people){
                System.out.println(person);
            }

            for (Person person: peopleList){
                System.out.println(person);
            }

            int run = os.readInt();

            for (int i =0; i<run; i++){
                Person person = (Person)os.readObject();
                System.out.println(person);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
