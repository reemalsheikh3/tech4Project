package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {
        /*
        Create an ArrayList called numbers that stores below numbers
         */
        System.out.println("---Task 1---");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println(numbers);

        System.out.println("---Task 2---");
        int count = 0;
        for (Integer number : numbers){
            if (number % 2 != 0) count++;
        }
        System.out.println("Odds = " + count);

            /*
        Practices
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */

        System.out.println("---Task 3---");
        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        System.out.println(colors);

        System.out.println("---Task 4---");
        count = 0;
        for (String color : colors){
         //   if (color.charAt(0) >= 65 && color.charAt(0) <= 90) count++;
            if (Character.isUpperCase(color.charAt(0))) count++;
        }
        System.out.println(count);

        /*
        Practices
        lowercases
        nulls
        empties
        that has length of 4 at least
        that has length of even or odd
        that has a or A
         */

    }
}
