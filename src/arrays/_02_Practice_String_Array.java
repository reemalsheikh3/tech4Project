package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        /*
        TASK-1
Create a String array and store below data
Name of the array will be students

Alex
Tom
John
James
Jordan
Lionel
Adam

1. Print the array
2. Sort the array and print it again

EXPECTED:
Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]

         */
        System.out.println("---Task-1---");
        String[] names1 = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(names1));
        Arrays.sort(names1);
        System.out.println("Sorted array = " + Arrays.toString(names1));

            System.out.println("---Task-2---");
            /*
TASK-2
Print the first and the last names after it is sorted

EXPECTED:
First name is = Adam
Last name is = Tom
 */
         //   for (int i = 0; i <= names1.length-1 ; i++) {
        //     if (i == 0) System.out.println("First name is = " + names1[i]);
        //    else if (i == names1.length - 1) System.out.println("Last name is = " + names1[i]);
        //   }

        System.out.println("First name is = " + names1[0]);
        System.out.println("Last name is = " + names1[names1.length-1]);


        System.out.println("---Task-3---");
        int count = 0;
        for (int i = 0; i <= names1.length-1 ; i++) {
            if (names1[i].startsWith("A")) count++;
        }
        System.out.println(count);

        System.out.println("---Task-3 for each loop---");
        int counter = 0;
        for (String element : names1){
            //if (element.startsWith("A")) counter++;
            if (element.charAt(0) == 'A') counter++;
        }
        System.out.println(counter);
        System.out.println("---Task-4---");
        int count4 = 0;
        for (int i = 0; i <= names1.length-1 ; i++) {
            if (names1[i].toLowerCase().contains("a") || names1[i].toLowerCase().contains("e")) count4++;
        }
        System.out.println(count4);
        System.out.println("\n---Task-4 for each loop---");
        int countAorE = 0;
        for (String name : names1){
            name = name.toUpperCase();
            if (name.contains("A") || name.contains("E")) countAorE++;
        }
        System.out.println(countAorE);
        System.out.println("---Task 5---");
        int countT5 = 0;
        for (String name : names1){
            if (name.length() >= 5) countT5++;
        }
        System.out.println(countT5);

        System.out.println("---Task 6---");
        boolean isJennifer = false;
        for (String name : names1){
            if (name.equalsIgnoreCase("Jennifer")) {
                isJennifer = true;
                break;
            }
        }
        System.out.println(isJennifer);
    }
}
