package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){

        //Task-1

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your first name?");
        String userFirstName = collect.next();

        System.out.println("What is your last name?");
        String userLastName = collect.next();

        System.out.println("What is your age?");
        int userAge = collect.nextInt();

        System.out.println("What is your email address?");
        String userEmailAddress = collect.next();

        System.out.println("What is your phone number?");
        collect.nextLine();
        String userPhoneNumber = collect.nextLine();

        System.out.println("What is your address?");
        String userAddress = collect.nextLine();

        System.out.println("User who joined this program is " + userFirstName + " " + userLastName + ". " + userFirstName
                + "'s age is \n" + userAge + ". " + userFirstName + "'s email address is " + userEmailAddress +
                ", phone number \n" + userPhoneNumber + ", and address is " + userAddress + ".");

        //Task-2

        System.out.println("What is your favorite book?");
        String userFavBook = collect.nextLine();

        System.out.println("What is your favorite color?");
        String userFavColor = collect.next();

        System.out.println("What is your favorite number?");
        int userFavNum = collect.nextInt();

        System.out.println( "User's favorite book is: " + userFavBook + "\nUser's favorite color is: " + userFavColor
                + "\nUser's favorite number is: " + userFavNum);

    }
}
