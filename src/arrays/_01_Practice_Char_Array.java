package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {
        //TASK-1
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));

        //TASK-2
        System.out.println("The size of the array is = " + chars.length);

        //TASK-3
        for (int i = 0; i <= chars.length-1 ; i++) {
            System.out.println(chars[i]);
        }
        //TASK-4
        for (char element : chars){
            System.out.println(element);
        }

        System.out.println("TASK-5"); //TASK-5
        for (int i = 0; i <= chars.length-1 ; i++) {
            if (Character.isLetter(chars[i])) {
             System.out.println(chars[i]);
            }
        }
        for (char character : chars){
            if (Character.isLetter(character)) System.out.println(character);
        }

        //Task-6
        int count = 0;
        for (int i = 0; i <= chars.length-1 ; i++) {
            if (Character.isUpperCase(chars[i])) count++;
        }
        System.out.println(count);

        int count2 = 0;
        for (char element : chars){
            if (Character.isUpperCase(element)) count2++;
        }
        System.out.println(count2);
    }
}
