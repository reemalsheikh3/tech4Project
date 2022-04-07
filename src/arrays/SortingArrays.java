package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /*
        HOW TO SORT AN ARRAY OF NUMBERS
        byte, short, int, long, float,double

        We will sort these in ascending order
        Lowest to highest
        (Descending : highest to lowest)
         */
        System.out.println("---Sorting in Ascending order---");
        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};
        System.out.println("My array is = " + Arrays.toString(numbers));

        //Sort in ascending order[-5, 0, 0, 0, 3, 7, 9, 10]
        Arrays.sort(numbers); //void method- wont return anything; CANT put in System.out.println
        System.out.println("My array is = " + Arrays.toString(numbers));

        System.out.println("---Sorting characters---");
        char[] characters = {'A', 'b', 'z', 'H'};
        System.out.println("My characters array = " + Arrays.toString(characters)); // [A, b, z, H]
        Arrays.sort(characters);
        System.out.println("My characters array = " + Arrays.toString(characters)); //[A, H, b, z]

        System.out.println("---Sorting words---");
        String[] names = {"Adam", "Adame", "tom", "ally", "Adele", "terry", "Josh"};
        System.out.println("My names array = " + Arrays.toString(names));

      //  for (int i = 0; i <= names.length-1 ; i++) {
         //   names[i] = names[i].toLowerCase();
       // }

        Arrays.sort(names);
        //Lexicographically
        System.out.println("My names array = " + Arrays.toString(names)); //[Adam, Adame, Adele, Josh, ally, terry, tom]
    }
}
