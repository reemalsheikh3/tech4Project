package ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");
        int num1 = input.nextInt(), num2 = input.nextInt();
        /*
        1st way
        Math.min(num1,num2);
         */

/*
  2nd way
  if(num1 < num2) System.out.println(num1);
        else System.out.println(num2);
 */

        //3rd way - using Ternary Operator
        /*
        Ternary Operator
        -Java ternary operator can be used instead of if-else statement
        -It is used a lot in Java programming
        NOTE: It can be used only for simple if-else statement
        You cannot use for if-else if-else and nested if else statements
        -variable variableName = condition ? option1 : option2;
         */

        int smallestNumber = num1 < num2 ? num1 : num2;
        System.out.println(smallestNumber);
    }
}
