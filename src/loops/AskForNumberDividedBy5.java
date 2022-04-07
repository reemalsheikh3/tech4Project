package loops;

import java.util.Scanner;

public class AskForNumberDividedBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int i = input.nextInt();

        while (i % 5 != 0){
            System.out.println("This number is not dividable by 5");
            System.out.println("Please enter a number");
            i = input.nextInt();
        }
        System.out.println("This number is dividable by 5");

        System.out.println("---Do While Loop---");
        int n;
        int attempt = 1;
        do {
            if (attempt == 1) System.out.println("Please enter a number");
            else System.out.println("Please enter a new number");
             n = input.nextInt();
            if (n % 5 != 0) System.out.println("This number is not dividable by 5");
            attempt ++;
        } while (n % 5 != 0);

        System.out.println("This number is dividable by 5");
    }
}
