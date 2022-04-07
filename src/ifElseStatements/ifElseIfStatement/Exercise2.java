package ifElseStatements.ifElseIfStatement;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age.");
        int age = input.nextInt();
        System.out.println("Please enter your weight.");
        int weight = input.nextInt();

        if (age >= 18){
            System.out.println("You are old enough to drive");
        }else{
            System.out.println("You are not old enough to drive");
        }
        if(weight > 150){
            System.out.println("You are heavier than 150 pounds");
        }else{
            System.out.println("You are lighter than 150 pounds");
        }
    }
}
