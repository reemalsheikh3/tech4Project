package homeworks;

import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("--- TASK 1 ---");

        int ran1 = RandomNumberGenerator.getRandomNumber(0, 50);
        if (ran1 >= 10 && ran1 <= 25) System.out.println("true");
        else System.out.println("false");

        System.out.println("--- TASK 2 ---");
        int t2_random = RandomNumberGenerator.getRandomNumber(1, 100);
        if (t2_random <= 50){
            System.out.println(t2_random + " is in the 1st half");
            if (t2_random <= 25){
                System.out.println(t2_random + " is in the 1st quarter");
                } else {
                System.out.println(t2_random + " is in the 2nd quarter");
            }
        }else{
            System.out.println(t2_random + " is in the 2nd half");
            if (t2_random <= 75){
                System.out.println(t2_random + " is in the 3rd quarter");
            } else {
                System.out.println(t2_random + " is in the 4th quarter");
            }
        }

        System.out.println("--- TASK 3 ---");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1 and 10 (1 and 10 included).");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt(), n4 = input.nextInt(),
                n5 = input.nextInt();

        if(n1 >= 1 && n1 <= 10){
            n1 = (n1 * 5);
        }else {
            n1 = 0;
        }
        if(n2 >= 1 && n2 <= 10){
            n2 = (n2 * 4);
        }else{
            n2 = 0;
        }
        if(n3 >= 1 && n3 <= 10){
            n3 = (n3 * 3);
        }else{
            n3 = 0;
        }
        if(n4 >= 1 && n4 <= 10){
            n4 = (n4 * 2);
        }else{
            n4 = 0;
        }
        if(n5 >= 1 && n5 <= 10){
            n5 = (n5 * 1);
        }else{
            n5 = 0;
        }
        System.out.println(n1 + n2 + n3 + n4 + n5);

    }

}
