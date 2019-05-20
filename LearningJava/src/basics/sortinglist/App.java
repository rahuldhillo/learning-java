package basics.sortinglist;

import java.util.*;


class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "ID is: " + id + "\tName is: " + name;
    }

}

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        if (s1.length()<s2.length())
            return 1;
        else if (s1.length()>s2.length())
            return -1;
        return 0;
    }
}

class ReverseStringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        if (s1.length()<s2.length())
            return -1;
        else if (s1.length()>s2.length())
            return 1;
        return 0;
    }
}

class ReverseAlphabatical implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class App {
    public static void main(String[] args) {

        //for String
        ArrayList<String> animals = new ArrayList<String>(); // or you can start with List<> instead of Array...

        animals.add("cat");
        animals.add("horse");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("dog");

        Collections.sort(animals);
        System.out.println(animals);

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        Collections.sort(animals, new ReverseStringLengthComparator());
        System.out.println(animals);

        Collections.sort(animals, new ReverseAlphabatical());
        System.out.println(animals);

        //for Integer
        List<Integer> numbers = new ArrayList<Integer>(); // or you can start with ArrayList<> instead of List...
        numbers.add(11);
        numbers.add(15);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // instead you can use -o1.compareTo(o2) or if else loop. Your choice.
            }
        });
        System.out.println(numbers);// will just wort inside the Array
        System.out.println();

        for (Integer number: numbers){// will for through Array
            System.out.println(number);
        }


        //for Person
        List<Person> person = new ArrayList<Person>();
        person.add(new Person(3, "Bob"));
        person.add(new Person(2, "Sue"));
        person.add(new Person(4, "Man"));
        person.add(new Person(1, "Woman"));

        //Sort by ID
        Collections.sort(person, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getID() > o2.getID()) {
                    return 1;
                }
                if (o1.getID() < o2.getID()) {
                    return -1;
                }
                return 0;
            }
        });
        for (Person people: person) {
            System.out.println(people);
        }

        System.out.println();

        //Sort by Name
        Collections.sort(person, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Person people: person) {
            System.out.println(people);
        }


    }
}
