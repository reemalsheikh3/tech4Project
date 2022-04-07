package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){

        /*
        How to use Scanner methods
        1. Create an object of Scanner (import the class as well (java.util.Scanner))
        ClassName/DataType variableName/objectName = new ClassName/DataType (if it is needed);
        2. variableName/objectName.methodName(if it is needed parameter);
         */



        Scanner collect = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = collect.nextInt();

        System.out.println("The user's age is = " + userAge);


        System.out.println("What is your account balance?");
        double userAccountBalance = collect.nextDouble();

        System.out.println("\n\t\'The user's account balance is\' = \"$" + userAccountBalance + "\"");

        System.out.println("Are you understanding the java class today?");
        boolean userUnderstanding = collect.nextBoolean();

        System.out.println("Student is understanding the project = " + "\"" + userUnderstanding + "\"");





    }
}
