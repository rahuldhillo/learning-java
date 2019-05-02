package basics.recursion;

public class App {
    public static void main(String[] args) {
        //int value = 4;
        calculate(4);
        //System.out.println(value);
        System.out.println("\nFactorial is: " + factorial(+ 4));
    }

    private static void calculate(int value){
        //value = value - 1;
        System.out.println(value);
        if (value == 1){ // will make recursion return to main method and terminate.
            return;
        }
        //calculate(value); // will result in stack overflow.
        calculate(value -1); // will print different value but over flow
        System.out.println("\n" + value + " I am after the recursion. I don't know why :(");
    }

    private static int factorial (int number){

        if (number == 1){
            return 1;
        }
        return factorial(number - 1) * number;
    }
}
