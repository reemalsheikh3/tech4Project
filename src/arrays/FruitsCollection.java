package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FruitsCollection {
    public static void main(String[] args) {
        /*
        Task-1
        Create an array that will store 4 fruit names
        PRint empty array
         */


        String[] fruitNames = new String[4];
        System.out.println(Arrays.toString(fruitNames));

        /*
        Task-2
        store your fav fruit and store it in index of 0
        Store the fourth favorite fruit in the index of 3

         */

        fruitNames[0] = "Apple";
        fruitNames[3] = "Banana";
        System.out.println(Arrays.toString(fruitNames));

        /*
        Find size of your array and print it
        size = how many elements you have in the array
         */
        System.out.println(fruitNames.length); //4

        /*
        Task-4
        Print the elements at the index of 0 and 3
         */
        System.out.println(fruitNames[0] + " " + fruitNames[3]);

        //What if we try to get a value that is null
        System.out.println(fruitNames[1]); // null

        System.out.println(fruitNames[0].toUpperCase()); // APPLE
        System.out.println(fruitNames[0].charAt(0)); // A
        System.out.println(fruitNames[3].length()); // 6
        System.out.println(fruitNames[3].startsWith("B")); // true

        System.out.println(fruitNames[1].length()); // NullPointerException


    }
}
