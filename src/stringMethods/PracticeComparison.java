package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    public static void main(String[] args) {
        /*

         */
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter 2 words");
        String s1 = input.nextLine(), s2 = input.nextLine();

        if (s1.equals(s2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");

        //2nd way
        System.out.println("2nd Way");
      //  String str1 = ScannerHelper.getAStringFromUser();
      //  String str2 = ScannerHelper.getAStringFromUser();

        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ? "These string are equal" : "These string are not equal");
    }
}
