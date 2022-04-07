package homeworks;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args){
        //Task-1
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("The average of the given 2 numbers is: " + ((num1 + num2) / 2));

        //Task-2
        System.out.println("Please enter 2 numbers.");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println("The product of the given 2 numbers is: " + (number1 * number2));

        //Task-3
        System.out.println("Please enter 3 numbers.");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        System.out.println("The 5 multiplied with 5 is = " + (n1 * n1) + "\nThe 6 multiplied with 6 is = " +
                (n2 * n2) + "\nThe 10 multiplied with 10 is = " + (n3 * n3));

        //Task-4
        System.out.println("Please enter 2 numbers.");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        System.out.println("The remainder of 25 % 8 = " + (firstNumber % secondNumber));

        //Task-5
        System.out.println("Please enter 5 numbers.");
        int nu1 = input.nextInt();
        int nu2 = input.nextInt();
        int nu3 = input.nextInt();
        int nu4 = input.nextInt();
        int nu5 = input.nextInt();

        System.out.println("The average of the given 5 numbers is: " + ((nu1 + nu2 + nu3 + nu4 + nu5) / 5));

        //Task-6
        System.out.println("Please enter a number.");
        int numb1 = input.nextInt();

        System.out.println("7 * 1 = " + (numb1 * 1) + "\n7 * 2 = " + (numb1 * 2) + "\n7 * 3 = " + (numb1 * 3) +
                "\n7 * 4 = " + (numb1 * 4) + "\n7 * 5 = " + (numb1 * 5) + "\n7 * 6 = " + (numb1 * 6) +
                "\n7 * 7 = " + (numb1 * 7) + "\n7 * 8 = " + (numb1 * 8) + "\n7 * 9 = " + (numb1 * 9) +
                "\n7 * 10 = " + (numb1 * 10));

        //Task-7
        System.out.println("Please enter the length of the side of a square.");
        int sideLength = input.nextInt();

        System.out.println("Perimeter of the square = " + (4 * sideLength) + "\nArea of the square = "
                + (sideLength * sideLength));

    }
}
