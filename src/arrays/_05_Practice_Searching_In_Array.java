package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};
        /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise
        */
        System.out.println("---Task 1---");
        boolean hasMouse = false;
        for (String element : objects){
            if (element.equals("Mouse")) {
                hasMouse = true;
                break;
            }
        }
        System.out.println(hasMouse);

        /*
        TASK-2
        Check the collection you have above and print true if one of the element is board
        Print false otherwise

        RESULT:
        false
        */

        System.out.println("---Task 2---");
        boolean hasBoard = false;
        for (String element : objects){
            if (element.equals("board")){
                hasBoard = true;
                break;
            }
        }
        System.out.println(hasBoard);

        /*
        TASK-3
        Check if you have an element equals to "iPad"
        If so, print true
        Else, print false

        "Remote", "Mouse","Mouse", "Keyboard", "iPad"

        Arrays class has binarySearch() method that helps us find if our collection contains a specific element or not
        NOTE: To be able to use this method, your array MUST be sorted first

        This method is taking 2 args, first is your array collection and the second is the element you are looking for

        1.One element is found -> it returns the index of the element - more than or equal to zero
        2.Multiple elements are found -> it returns the index of last occurrence
        3.No element found -> always returns negative index (-possible index -1)
         */

        System.out.println("---Task 3---");
        Arrays.sort(objects); //["Keyboard", "Mouse", "Mouse", "Remote", "iPad"]
                              //     0          1        2        3         4
        System.out.println(Arrays.binarySearch(objects, "iPad")); //index of 4
        System.out.println(Arrays.binarySearch(objects, "Mouse")); //index of 2 (returns the last index if multiple elements)
        System.out.println(Arrays.binarySearch(objects, "Phone")); // negative (-4)

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); //true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); //true
        System.out.println(Arrays.binarySearch(objects, "Phone") >= 0); //false

        System.out.println("---Task 4---");
        int[] numbersT4 = {5, -2, 0, -7, 0, 5, 8, 45, 53};

        Arrays.sort(numbersT4);
        System.out.println(Arrays.binarySearch(numbersT4, 5) >= 0);
        System.out.println(Arrays.binarySearch(numbersT4, 0) >= 0);
        System.out.println(Arrays.binarySearch(numbersT4, 45) >= 0);
        System.out.println(Arrays.binarySearch(numbersT4, 3) >= 0);
        System.out.println(Arrays.binarySearch(numbersT4, -7) >= 0);

        System.out.println(Arrays.binarySearch(numbersT4, 5, 9, 0) >= 0); //false


    }
}
