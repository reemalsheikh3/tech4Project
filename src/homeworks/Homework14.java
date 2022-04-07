package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println("----TASK 1----");
       // int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        //int[] numbers = {-8, 56, 7, 8, 65};
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && count == 0) {
                    count++;
                    System.out.println(numbers[i]);
                }
            }
        }
        if (count == 0) System.out.println("There is no duplicates");
        System.out.println("----TASK 2----");
        //String[] words = {"Z", "abc", "z", "123", "#"};
        //String[] words = {"xyz", "java", "abc"};
        String[] words = {"a", "b", "B", "XYZ", "123"};
        count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((words[i].equalsIgnoreCase(words[j])) && count == 0)    {
                    count++;
                    System.out.println(words[i]);
                }
            }
        }
        if (count == 0) System.out.println("There is no duplicates");

        System.out.println("----TASK 3----");
        //int[] numbersT3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        int [] numbersT3 = {1, 2, 5, 0, 7};
        List<Integer> duplicatedNumbers = new ArrayList<>();

        for (int i = 0; i < numbersT3.length; i++) {
            for (int j = i + 1; j < numbersT3.length; j++) {
                if (!duplicatedNumbers.contains(numbersT3[i]) && numbersT3[i] == numbersT3[j]) duplicatedNumbers.add(numbersT3[i]);
            }
        }
        if (duplicatedNumbers.size() == 0) System.out.println("There is no duplicates");
        else {
            for (int i = 0; i < duplicatedNumbers.size(); i++) {
                System.out.println(duplicatedNumbers.get(i));
            }
        }
        System.out.println("----TASK 4----");
        //String[] wordsT4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        String [] wordsT4 = {"python", "foo", "bar", "java", "123"};
        List<String> duplicatedWords = new ArrayList<>();

        for (int i = 0; i < wordsT4.length; i++) {
            for (int j = i + 1; j < wordsT4.length; j++) {
                if (!duplicatedWords.contains(wordsT4[i].toUpperCase()) && wordsT4[i].equalsIgnoreCase(wordsT4[j])){
                    duplicatedWords.add(wordsT4[i]);
                }
            }
        }
        if (duplicatedWords.size() == 0) System.out.println("There is no duplicates");
        else {
            for (int i = 0; i < duplicatedWords.size(); i++) {
                System.out.println(duplicatedWords.get(i));
            }
        }
        System.out.println("----TASK 5----");
        //String[] words1 = {"abc", "foo", "bar"};
        String[] words1 = {"java", "python", "ruby"};
        List<String> backwards = new ArrayList<>();
        for (int i = words1.length-1; i >= 0; i--) {
            backwards.add(words1[i]);
        }
        System.out.println(backwards);
        System.out.println("----TASK 6----");
        String str = "Java is fun";
        String[] strArr = str.split(" "); //[Java, is, fun]
        String reversedWords = "";
        for (String word : strArr){
            for (int i = word.length()-1; i >= 0 ; i--) {
                reversedWords += word.charAt(i);
            }
            reversedWords += " ";
        }
        System.out.println(reversedWords);
    }
}
