package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I am going to use Scanner class for creating my object.
        2. I  will use the object for reading the data.
         */

        Scanner scanner = new Scanner(System.in); // created a scanner object for using next() method

        System.out.println("Please put your first name:"); // this is what I want user to input
        String firstName = scanner.next(); // storing the first name from user

        System.out.println("Please put your last name:");
        String lastName = scanner.next();


        System.out.println("First name = " + firstName); //printing my object/variable
        System.out.println("Last name = "+ lastName);


    }
}
