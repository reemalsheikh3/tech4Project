package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args){

        //Task - 1

        Scanner collect = new Scanner (System.in);

        System.out.println("Please enter a number from 1 - 10.");
        int number1 = collect.nextInt();
        //number1 = 5;

        System.out.println("Please enter another number from 1 - 10.");
        int number2 = collect.nextInt();
        //number2 = 10;

        System.out.println("The number 1 entered by user is = " + number1 + "\nThe number 2 entered by user is = " +
                number2 + "\nThe sum of number 1 and 2 entered by user is = \n" + (number1 + number2));

        //Task-2

        System.out.println("Please enter a number from 1 - 100.");
        double num1 = collect.nextDouble();
        //num1 = 45.45;

        System.out.println("Please enter another number from 1 - 10.");
        double num2 = collect.nextDouble();
       // num2 = 5;

        System.out.println("The number 1 entered by user is = " + num1 + "\nThe number 2 entered by user is = " +
                num2 + "\nThe division of number 1 and 2 entered by user is \n= " + (num1 / num2));

        //Task-3

        //1.
        int numb1 = -10;
        int numb2 = 7;
        int numb3 = 5;
        System.out.println(numb1 + (numb2 * numb3));

        //2.
        int n1 = 72;
        int n2 = 24;
        System.out.println((n1 + n2) % n2);

        //3.
        int n3 = 10;
        int n4 = -3;
        int n5 = 9;
        System.out.println((n3 + n4) * (n5 / n5));

        //4.
        int nu1 = 5, nu2 = 18, nu3 = 3, nu4 = 6;
        System.out.println(nu1 + nu2 / nu3 * nu3 - (nu4 % nu3));

        //Task-4

        System.out.println("Please enter a number from 1 - 30.");
        double numberOne = collect.nextDouble();
        numberOne = 24;

        System.out.println("Please enter a number from 1 -10.");
        double numberTwo = collect.nextInt();
        numberTwo = 10;

        System.out.println("The sum of the given numbers is = " + (numberOne + numberTwo) + "\nThe product of the " +
                "given numbers is = " + (numberOne * numberTwo) + "\nThe subtraction of the given numbers is = "
        + (numberOne - numberTwo) + "\nThe division of the given numbers is = " + (numberOne / numberTwo) +
                "\nThe remainder of the given numbers is = " + (numberOne % numberTwo));

        //Task-5
        double width = 7.5;
        double height = 10.5;
        System.out.println("The area of the rectangle = " + (width * height) + "\nThe perimeter of the rectangle = " +
                (2 * (width + height)));

        //Task-6
        double annualAvgSalary = 90000;
        double years = 3;
        System.out.println("A software Engineer in Test can earn " + (annualAvgSalary * years) + " in \n3 years.");

    }
}
