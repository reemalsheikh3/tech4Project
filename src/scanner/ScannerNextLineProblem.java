package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args){

        /*
        name
        age
        myBrainOK
        fav quote
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = userInput.next();

        System.out.println("What is your age?");
        int age = userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean myBrainOk = userInput.nextBoolean();

        System.out.println("What is your address?");
        userInput.nextLine();
        String address = userInput.nextLine();

        System.out.println("User name is = "+ name + "\nUser age is = " + age + "\nIs user's brain ok? = "+ myBrainOk
        + "\nUser's address is = " + address);


        int number = 10; //declaration and assignment

        System.out.println("Number is = " + number);

        number = 20; //re-assignment

        System.out.println("Number is = " + number);

    }
}
