package basics.equals;

import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Person [id = "+ id +", name= "+ name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class App {
    public static void main(String[] args) {

        System.out.println(new Object()); //does not have toString method and hence returned hashcode including the package.
        Person person1 = new Person (5, "Bob");
        Person person2 = new Person (5, "Bob");
        //person1 = person2; //Poiting to same object, hence will print true.
        //System.out.println(person1 == person2);

        //to semantically compare. we can use .equals().
        System.out.println(person1.equals(person2));

        Integer int1 = 7;
        Integer int2 = 7;
        System.out.println(int1 == int2);

        Double dob1 = 7.7;
        Double dob2 = 7.7;
        System.out.println(dob1.equals(dob2));

        String str = "Hello";
        String str2 = "Hellomhtrrbrb".substring(0,5);
        System.out.println(str2);
        System.out.println(str.equals(str2));
    }
}
