package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        //-TASK-1
        String s1 = "5", s2 = "10";
        int s1Int = Integer.parseInt(s1), s2Int = Integer.parseInt(s2);
        System.out.println("-Sum of 5 and 10 is = " + (s1Int + s2Int) + "\n-Product of 5 and 10 is = " +
                (s1Int * s2Int) + "\n-Division of 5 and 10 is = " + (s1Int / s2Int) + "\n-Subtraction of 5 and 10 is = " +
                (s1Int - s2Int) + "\n-Remainder of 5 and 10 is = " + (s1Int % s2Int));

        //TASK-2
        String n1 = "200", n2 = "-50";
        int n1Int = Integer.parseInt(n1), n2Int = Integer.parseInt(n2);
        System.out.println("The greatest value is = " + (Math.max(n1Int, n2Int)) + "\nThe smallest value is = " +
                (Math.min(n1Int, n2Int)) + "\nThe average is = " + ((n1Int + n2Int) / 2) +
                "\nThe absolute difference is = " + (Math.abs(n1Int - n2Int)));

        //TASK-3
        double savePerDay = (0.75 + 0.10 + 0.10 + 0.01);
        System.out.println(((int)(24 / savePerDay)) + " days\n" + ((int)(168 / savePerDay)) + " days\n$" +
                (150 * savePerDay));

        //TASK-4
        double jessieSavePerDay = 62.5, newComputer = 1250;
        System.out.println((int) (newComputer / jessieSavePerDay));

        //TASK-5
        double paymentOption1 = 475.50, paymentOption2 = 951, newCar = 14265;
        System.out.println("Option 1 will take " + (int)(newCar / paymentOption1) + " months\nOption2 will take " +
                (int)(newCar / paymentOption2) + " months");

        //TASK-6
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");
        int number1 = in.nextInt(), number2 = in.nextInt();

        System.out.println((double)number1 / number2);

    }
}
