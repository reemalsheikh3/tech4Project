package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Exercise01_remove_duplicates {
    public static void main(String[] args) {
        /*
        Create an ArrayList and store below elements
        Computer
        Phone
        Mouse
        Mouse
        Phone
        Pen

        From above list, remove all duplicates and print unique elements

        EXPECTED RESULT:
        [Computer, Phone, Mouse, Pen]
         */
        System.out.println("\n----First Way - not preferred----\n");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println("My list before removing = " + objects);

        //Create an empty list to store unique values
        ArrayList<String> uniques = new ArrayList<>();
        for (String object : objects) {
            if (!uniques.contains(object)) uniques.add(object);
        }

        System.out.println("My list after removing = " + uniques);

        System.out.println("\n----Second Way - using collections - preferred----\n"); //Any set

        //TreeSet -> Computer, Mouse, Pen, Phone
        //HashSet -> no prediction of order
        //LinkedHashSet -> will preserve insertion order with no duplicates**

       /*
       LinkedHashSet<String> myUniques = new LinkedHashSet<>(objects);
       System.out.println(myUniques);
        */

        System.out.println(new LinkedHashSet<>(objects));


    }
}
