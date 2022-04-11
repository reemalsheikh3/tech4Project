package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Project08 {
    public static int countMultipleWords(String[] arr) {
        int count = 0;
        for (String element : arr) {
            if (element.trim().contains(" ")) count++;
        }
        return count;
    }

    public static ArrayList removeNegatives(ArrayList<Integer> numbers){
        numbers.removeIf(number -> number < 0);
        return numbers;
}

    public static boolean validatePassword(String password){
        boolean validPasswordLength = false;
        boolean validPasswordContainsDigit = false;
        boolean validPasswordContainsUppercase = false;
        boolean validPasswordContainsLowercase = false;
        boolean validPasswordContainsSpecial = false;
        boolean validPasswordNoSpaces = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.length() >= 8 && password.length() <= 16) validPasswordLength = true;
            if (password.charAt(i) >= 48 && password.charAt(i)<= 57) validPasswordContainsDigit = true;
            if (password.charAt(i) >= 65 && password.charAt(i)<= 90) validPasswordContainsUppercase = true;
            if (password.charAt(i) >= 97 && password.charAt(i)<= 122) validPasswordContainsLowercase = true;
            if (!Character.isWhitespace(i)) validPasswordNoSpaces = true;
            if ((password.charAt(i) >= 33 && password.charAt(i) <= 47) ||
                    (password.charAt(i) >= 91 && password.charAt(i) <= 96) ||
                    (password.charAt(i) >= 123 && password.charAt(i) <= 126))
                validPasswordContainsSpecial = true;
        }
        if (validPasswordLength && validPasswordContainsDigit && validPasswordContainsUppercase &&
                validPasswordContainsLowercase && validPasswordNoSpaces &&
                validPasswordContainsSpecial) return true;
        else return false;
    }

    public static boolean validateEmailAddress(String email){
        boolean validateEmailNoSpaces = false;
        int count = 0;
        boolean validateEmailContains1Special= false;
        boolean validateEmailFormat = false;
        for (int i = 0; i < email.length(); i++) {
            if (!Character.isWhitespace(i)) validateEmailNoSpaces = true;
            if (email.charAt(i) == '@') count++;
            if ((email.substring(0, email.indexOf('@')).length() >= 2) &&
                    (email.substring(email.indexOf('@')+1, email.indexOf('.')).length() >= 2)
                    && (email.substring(email.indexOf('.') +1).length() >= 2)) validateEmailFormat = true;
        }
        if (count == 1) validateEmailContains1Special = true;
        if (validateEmailNoSpaces && validateEmailFormat && validateEmailContains1Special) return true;
        else return false;
    }

    public static void main(String[] args) {
        String [] arr = {"foo", "", " ", "foo bar", "java is fun", "ruby"};
        System.out.println(countMultipleWords(arr));
        int [] numbers = {2, -5, 6, 7, -10, -78, 0, 15};
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(2);
        numbersList.add(-5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(-10);
        numbersList.add(-78);
        numbersList.add(0);
        numbersList.add(15);
        System.out.println(removeNegatives(numbersList));
        System.out.println(validatePassword("abcd123!"));
       // System.out.println(validateEmailAddress("abc@gmail.c"));
        //System.out.println(validateEmailAddress("abc@g.com"));
      //  System.out.println(validateEmailAddress("abcd@gmail.com"));
    }
}
