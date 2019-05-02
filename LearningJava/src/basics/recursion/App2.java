package basics.recursion;

public class App2 {

    public static void main(String[] args) {
        calculate(4);
    }

    private static void calculate(int value){

        System.out.println(value);
        if (value == 1){
            return;
        }

        calculate(value -1); // recursive call

        System.out.println(value + " I am after the recursion"); //Explain this
    }
}


