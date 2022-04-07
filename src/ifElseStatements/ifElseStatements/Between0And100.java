package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class Between0And100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int n1 = in.nextInt();

        //&& doesn't like false , || likes true

        // boolean isNumBiggerThan0 = n1 >= 0;
       // boolean isNumSmallerThan100 = n1 <= 100;
      //  boolean inBetween0And100 = n1 >= 0 && n1 <= 100;

        if (n1 >= 0 && n1 <= 100) {
            System.out.println("It is between 0 and 100");
        } else {
            System.out.println("it is not between 0 and 100");
        }
    }
}
