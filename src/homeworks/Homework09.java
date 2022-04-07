package homeworks;

import utilities.ScannerHelper;
import utilities.StringHelper;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {

        //TASK-1

        String name = ScannerHelper.getNameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length() - 3));
        if (name.toUpperCase().startsWith("A")) System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");

        //TASK-2

        String address = ScannerHelper.getAddressFromUser(); //I made a scanner helper method to get an address
        if(address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.contains("Des Plaines")) System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");

        //TASK-3

        Scanner collect = new Scanner(System.in);
        System.out.println("Please enter at least 4 colors.");
        String colors = collect.nextLine();

        if ((colors.toLowerCase().contains("red")) && (colors.toLowerCase().contains("green")))
            System.out.println("Green and red are in the list");
        else if (colors.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else if (colors.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");

        //TASK-4

        String str = "   Java is FUN   ";
        System.out.println("The first word in this str is = " + str.trim().toLowerCase().substring(0, 4));
        System.out.println("The second word in the str is = " + str.trim().toLowerCase().substring(5, 7));
        System.out.println("The third word in the str is = " + str.trim().toLowerCase().substring(8));
    }
}
