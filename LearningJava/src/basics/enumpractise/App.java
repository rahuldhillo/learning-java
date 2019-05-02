package basics.enumpractise;


//enum is underrated. it has type safety. its better than public final static.
public class App {

    /*public static final int DOG =0;
    public static final int CAT =1;
    public static final int MOUSE =2;*/

    public static void main(String[] args) {
        /*int animal = CAT; /*this animal can be initialized even with
                            *ith integers. We can fix this with enum
                            by restricting to the number an type of values.
                            and we shoudl have to know all the constant if they
                            exist. Hence enum helps not to remember them all.*/

        Animal animal = Animal.CAT; //Enum calling
         switch(animal){
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
             case MOUSE:
                 System.out.println("Mouse");
                 break;
            default:
                break;
         }

        System.out.println(Animal.DOG);// toString version. Earlier its was printing DOG
        System.out.println("Enum constant as a String: " + Animal.DOG.name());// will still return constant' name String. DOG. Useful in saving name in database.
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG.toString());
        System.out.println(Animal.DOG.getName()); // calling enum's getName

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
    }
}
