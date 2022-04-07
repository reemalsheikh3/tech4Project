package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter their favorite book name and quote and store answers of user in different Strings
        Finally, print the length of those Strings with proper message
        */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite book name?");
        String favBook = input.nextLine();
        System.out.println("What is your favorite quote?");
        String favQuote = input.nextLine();

        System.out.println("The number of characters in the name of your favorite book is " + (favBook.length()) +
                "\nAnd the number of characters in your favorite quote is " + (favQuote.length()));
    }
}
