package loops.doWhileLoop;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Please enter a number");
        int n = input.nextInt();

        while(n < 10) {
            System.out.println("This number is not more than or equal to 10");
            System.out.println("Please enter a number");
            n = input.nextInt();
        }
        System.out.println("This number is more than or equal to 10");

         */

        int n;
        int attempt = 1;
        do {
            if (attempt == 1)System.out.println("Please enter a number");
            else {
                System.out.println("This number is not more than or equal to 10");
                System.out.println("Please enter a new number");
            }
            n = input.nextInt();
            attempt++;
        }while(n < 10);

        System.out.println("This number is more than or equal to 10");


    }
}
