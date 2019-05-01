package hackerRankEx;
import java.util.Scanner;

public class StdinStdout{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer");
        int i = scan.nextInt();
        System.out.println("Enter Double");
        double d = scan.nextDouble();
        System.out.println("Enter String");
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
