package basics.runtimeexceptions;

public class App {
    public static void main(String[] args) {

        //runtime exception. compile but nt run. because they are basic concepts and serious and fundamental
        //int value = 7;
        //value = value /0;

        //nullPointerException. th object code is not there. referring to noting.
        /* String string = null;
        string.length();
        System.out.println(string.length());*/

        //ArrayIndexOutOfException
        String []  text = {"one", "two", "three"};
        try{
        System.out.println(text[3]);}
        catch (ArrayIndexOutOfBoundsException e){ //Can use Exception or RunTimeException instead or ArrayIndexOutOfBounds
            System.out.println(e.toString());
        }
    }
}
