package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class DividableBy7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number?");
        double n1 = in.nextDouble();

        if(n1 % 7 == 0){
            System.out.println("The number you divided is dividable by 7.");
        } else{
            System.out.println("The number you divided is not dividable by 7.");
        }
    }
}
