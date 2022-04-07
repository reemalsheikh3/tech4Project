package homeworks;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args){
        System.out.println("---TASK 1---");
        Scanner input = new Scanner(System.in);
        System.out.println("Given String: ");
        String s1 = input.nextLine();

        if (s1.length() < 1) System.out.println("Length is zero");
        else {
            System.out.println("Length is = " + s1.length());
            System.out.println("First char is = " + s1.charAt(0));
            System.out.println("Last char is = " + s1.charAt(s1.length() - 1));
            if (s1.toLowerCase().contains("a") || s1.toLowerCase().contains("e") || s1.toLowerCase().contains("i")
                    || s1.toLowerCase().contains("o") || s1.toLowerCase().contains("u"))
                System.out.println("This String has vowel");
            else System.out.println("This String does not have vowel");
        }

        System.out.println("---TASK 2---");
        System.out.println("Given String: ");
        String s2 = input.nextLine();

        if (s2.length() < 3) System.out.println("Length is less than 3");
        else if (s2.length() % 2 == 0){
            System.out.println( "" + s2.charAt((s2.length()/2)-1) + (s2.charAt(s2.length()/2)));
        }
        else System.out.println(s2.charAt(s2.length()/2));

        System.out.println("---TASK 3---");
        System.out.println("Given String: ");
        String s3 = input.nextLine();

        if (s3.length() < 4) System.out.println("INVALID INPUT");
        else{
            System.out.println("First 2 characters are = " + s3.substring(0,2));
            System.out.println("Last 2 characters are = " + s3.substring(s3.length()-2));
            System.out.println("The other characters are = " + s3.substring(2, s3.length()-2));
        }

        System.out.println("---TASK 4---");
        System.out.println("Given String: ");
        String s4 = input.nextLine();

        if (s4.length() < 2) System.out.println("Length is less than 2");
        else if (s4.substring(0, 2).equals(s4.substring(s4.length()-2))) System.out.println("true");
        else System.out.println("false");

        System.out.println("---TASK 5---");
        System.out.println("Given String: ");
        String s5 = input.nextLine();
        System.out.println("Given String: ");
        String str5 = input.nextLine();

        if (s5.length() >= 2 && str5.length() >= 2)
        System.out.println(s5.substring(1, s5.length()-1) + str5.substring(1, str5.length()-1));
        else System.out.println("INVALID INPUT");

        System.out.println("---TASK 6---");
        System.out.println("Given String: ");
        String s6 = input.nextLine();

        if (s6.length() < 4) System.out.println("INVALID INPUT");
        else if (s6.startsWith("xx") && s6.endsWith("xx")) System.out.println("true");
        else System.out.println("false");
    }
}
