package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args){
        //How to sort an array
        System.out.println("----Sorting an Array----");
        int[] numbersArray = {3, 7, 0, 4};
        Arrays.sort(numbersArray);
        System.out.println("My array after sort = " + Arrays.toString(numbersArray));

        //How to sort an arrayList
        System.out.println("----Sorting an ArrayList----");
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(0);
        numbersList.add(4);
        Collections.sort(numbersList);
        System.out.println("My Array List after sorting = " + numbersList);


    }
}
