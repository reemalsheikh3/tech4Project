package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        //TASK-1
        int n1 = (int) (Math.random() * 11), n2 = (int) (Math.random() * 11), n3 = (int) (Math.random() * 11),
                n4 = (int) (Math.random() * 11);
        System.out.println("Number 1 = " + n1 + "\nNumber 2 = " + n2 + "\nNumber 3 = " + n3 + "\nNumber 4 = " + n4
                + "\nAbsolute difference of " + n1 + " with 5 is = " + (Math.abs(5 - n1)) + "\nAbsolute difference of " + n2
                + " with 5 is = " + (Math.abs(5 - n2)) + "\nAbsolute difference of " + n3 + " with 5 is = " + (Math.abs(5 - n3))
                + "\nAbsolute difference of " + n4 + " with 5 is = " + (Math.abs(5 - n4)) + "\nGreatest number is = " +
                (Math.max(Math.max(Math.max(n1, n2), n3), n4)) + "\nSmallest number is = " +
                (Math.min(Math.min(Math.min(n1, n2), n3), n4)));

        //TASK-2
        int num1 = (int) (Math.random() * 101) - 50, num2 = (int) (Math.random() * 101) - 50,
                num3 = (int) (Math.random() * 101) - 50, num4 = (int) (Math.random() * 101) - 50,
                num5 = (int) (Math.random() * 101) - 50, num6 = (int) (Math.random() * 101) - 50,
                num7 = (int) (Math.random() * 101) - 50, num8 = (int) (Math.random() * 101) - 50;
        int max = (Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5)
                , num6), num7), num8));
        int min = (Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5)
                , num6), num7), num8));
        boolean positiveNumber = (num3 > 0), negativeNumber = (num5 < 0);

        System.out.print("Number 1 = " + num1 + "\nNumber 2 = " + num2 + "\nNumber 3 = " + num3 + "\nNumber 4 = " +
                num4 + "\nNumber 5 = " + num5 + "\nNumber 6 = " + num6 + "\nNumber 7 = " + num7 + "\nNumber 8 = " +
                num8 + "\nGreatest number is = " + max + "\nSmallest number is = " + min + "\nAverage of 8 numbers is = " +
                (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8 +
                "\nAbsolute difference between smallest and greatest is = " + (max - min) / 2 + "\n3rd number is positive = " +
                positiveNumber + "\n5th number is negative = " + negativeNumber +
                "\nThere is at least one zero among those numbers = ");
        if (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //TASK-3
        Scanner collect = new Scanner(System.in);
        System.out.println("Please enter 7 numbers between 0 and 50.");
        int number1 = collect.nextInt(), number2 = collect.nextInt(), number3 = collect.nextInt(), number4 = collect.nextInt(),
                number5 = collect.nextInt(), number6 = collect.nextInt(), number7 = collect.nextInt();

        boolean greaterOrEqualTo10 = (number1 >= 10);
        boolean lessThanOrEqualTo40 = (number7 <= 40);

        System.out.print("Number 1 = " + number1 + "\nNumber 2 = " + number2 + "\nNumber 3 = " + number3 + "\nNumber 4 = " +
                number4 + "\nNumber 5 = " + number5 + "\nNumber 6 = " + number6 + "\nNumber 7 = " + number7 +
                "\nGreatest number is = " + (Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(number1, number2),
                number3), number4), number5), number6), number7)) +
                "\nSmallest number is = " + (Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(number1, number2),
                number3), number4), number5), number6), number7)) + "\nAverage of 7 numbers is = " +
                (number1 + number2 + number3 + number4 + number5 + number6 + number7) / 7 + "\nFirst number is greater than " +
                "or equal to 10 = " + greaterOrEqualTo10 + "\nLast number is less than or equal to 40 = " + lessThanOrEqualTo40 +
                "\nBoth first and last numbers are greater than 25 = " + (number1 > 25 && number7 > 25) +
                "\nAt least one of those numbers is 0 or 50 = ");
        if (number1 == 0 || number1 == 50 || number2 == 0 || number2 == 50 || number3 == 0 || number3 == 50 ||
                number4 == 0 || number4 == 50 || number5 == 0 || number5 == 50 || number6 == 0 || number6 == 50 ||
                number7 == 0 || number7 == 50) System.out.println("true");
        else System.out.println("false");

        System.out.print("There is no number between 40 and 50 = ");
        if (number1 <= 50 || number1 >= 40 || number2 <= 50 || number2 >= 40 || number3 <= 50 || number3 >= 40 ||
                number4 <= 50 || number4 >= 40 || number5 <= 50 || number5 >= 40 || number6 <= 50 || number6 >= 40 ||
                number7 <= 50 || number7 >= 40) System.out.println("false");
        else System.out.println("true");


        //TASK-4
        int r1 = (int)(Math.random() * 101), r2 = (int)(Math.random() * 101), r3 = (int)(Math.random() * 101);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        if (r1 > 25 && r2 > 25 && r3 > 25) System.out.println("true");
        else System.out.println("false");

        //TASK-5
        System.out.println("Please enter a number between 1 to 7.");
        int userNum = collect.nextInt();
        switch (userNum){
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
                break;
            default:
                System.out.println("This is not representing any day.");
        }
        //TASK-6
        System.out.println("Please enter a number between -10 to 10.");
        int numberBetween_10To10 = collect.nextInt();

        if(numberBetween_10To10 % 2 == 0) System.out.println("Number entered is EVEN");
        if(numberBetween_10To10 == 0) System.out.println("Number entered is ZERO");
        else if (numberBetween_10To10 % 2 != 0) System.out.println("Number entered is ODD");
        if(numberBetween_10To10 > 0) System.out.println("Number entered is POSITIVE");
        else if(numberBetween_10To10 < 0) System.out.println("Number entered is NEGATIVE");

        //TASK-7
        System.out.println("Tell me your exam results?");
        int exam1 = collect.nextInt(), exam2 = collect.nextInt(), exam3 = collect.nextInt();
        int avgOfExams = (exam1 + exam2 + exam3) / 3;

        if (avgOfExams < 70) System.out.println("YOU FAILED!");
        else System.out.println("YOU PASSED!");

        //TASK-8
        System.out.println("Please enter 3 numbers");
        int numb1 = collect.nextInt(), numb2 = collect.nextInt(), numb3 = collect.nextInt();

        if (numb1 == numb2 && numb2 == numb3) System.out.println("TRIPLE MATCH");
        else if (numb1 == numb2 || numb2 == numb3 || numb1 == numb3) System.out.println("DOUBLE MATCH");
        else if ((numb1 != numb2 || numb2 != numb3 || numb1 != numb3)) System.out.println("NO MATCH");

    }
}