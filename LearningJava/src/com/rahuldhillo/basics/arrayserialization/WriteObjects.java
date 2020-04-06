package com.rahuldhillo.basics.arrayserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects...");

        Person[] people = {new Person(1,"Bob"), new Person (2, "Sue"), new Person (3, "Marry")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        try (FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)
        ) {
            os.writeObject(people);
            os.writeObject(peopleList);

            os.writeInt(peopleList.size());

            for (Person person: peopleList){
                os.writeObject(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
