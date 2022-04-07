package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class _12_contains {
    public static void main(String[] args) {
        /*
        Method Task: It is used to find out if a String contains another string or character
        -It is non-static, and we can call if with an object
        -It is a return type, and it returns a boolean
        -It takes a String argument
         */

        String s= "Good Morning!";
        System.out.println(s.contains("Good")); //true
        System.out.println(s.contains("")); //true
        System.out.println(s.contains("123")); //false
        System.out.println(s.contains(s)); //true

        /*
        Ask user to enter an address
        If address contains "chicago" in any way, then print "You are in the club"
        else, print "You are not in the club"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an address");
        String address = input.nextLine();

        if(address.toUpperCase().contains("CHICAGO")) {
            System.out.println("You are in the club");
        }else{
            System.out.println("You are not in the club");
        }
    }
}
