package arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};
        System.out.println(chars.length); //7

        /*
        PRint each element with a message

        Expected output:
        Element = A
        Element =

         */
        System.out.println("----Fori Loop----");
        for (int i = 0; i <= chars.length-1 ; i++) {
            System.out.println("Element = " + chars[i]);
        }
        System.out.println("----For each Loop----");
        for (char element: chars){
            System.out.println("Element = " + element);
        }


    }
}
