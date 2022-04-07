package methods;

import utilities.MathHelper;

import java.util.Scanner;

public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args){
        /*
        Ask user to enter any number
        Print "The number is positive" if the number is positive
        Print "The number is negative" if the number is negative
        Print "The number is zero" if the number is zero
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int n1 = input.nextInt();
        if (MathHelper.isPositive(n1)) System.out.println("The number is positive");
        else if (MathHelper.isNegative(n1)) System.out.println("The number is negative");
        else System.out.println("The number is zero");
    }
}
