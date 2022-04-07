package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        Create scanner and ask to enter 2 different integers between 0 and 10
        Create variables and find start point (min of 2 numbers) and end point(max of 2 numbers)
        skip 5 if it is included
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 different integers between 0 to 10");
        int n1 = scan.nextInt(), n2 = scan.nextInt();
        for (int i = Math.min(n1, n2); i <= Math.max(n1, n2); i++){
            if (i == 5) continue;
            System.out.println(i);
        }
    }
}
