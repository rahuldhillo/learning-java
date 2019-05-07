package hackerrankex;

import java.util.Scanner;

public class JavaLoopI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n >= 2 && n <=20){
            for (int i = 1; i < 11 ; i++ ){
                int y = n*i;
                System.out.printf("%d x %d = %d%n",n,i,y);
            }
        }
        scanner.close();
    }
}
