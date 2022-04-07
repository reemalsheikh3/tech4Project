package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("---TASK 1---");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String s1 = scan.nextLine().trim();
        int counter = 1;

        for (int i = 0; i <= s1.length() - 1; i++) {
            if ((s1.charAt(i) == ' ')) counter++;
        }
        if (counter > 1) System.out.println("This sentence has " + counter + " words.");
        else System.out.println("This sentence does not have multiple words.");

        System.out.println("---TASK 2---");
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        boolean isPalindrome = true;
        if (word.length() < 1) System.out.println("This word does not have 1 or more characters");
        for (int i = 0; i <= word.length()-1; i++) {
            for (int j = word.length()-1; j >= 0; j--) {
                if (word.charAt(i) == word.charAt(j)) isPalindrome = true;
                else isPalindrome = false;
                }
            }
            if (isPalindrome) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");


        System.out.println("---TASK 3---");
        System.out.println("Please enter a sentence as a String");
        String s3 = scan.nextLine();
        int aCounter = 0;

        for (int i = 0; i <= s3.length()-1 ; i++) {
            if (s3.charAt(i) == 'a' || s3.charAt(i) == 'A') aCounter++;
        }
        if (s3.length() < 1) System.out.println("This sentence does not have any characters");
        else System.out.println("This sentence has " + aCounter + " a or A letters.");

        System.out.println("---TASK 4---");
        System.out.println("Please enter a positive number");
        int num = scan.nextInt();

        for (int i = 1; i <= num ; i++) {
            if (i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
        }
    }
