package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args){

        //TASK-1
        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int num1 = collect.nextInt();

        System.out.println("Please enter another number.");
        int num2 = collect.nextInt();

        System.out.println("Please enter another number.");
        int num3 = collect.nextInt();

        System.out.println("The product of the numbers entered is = " + (num1 * num2 * num3));

        //TASK-2

        System.out.println("What is your first name?");
        String firstName = collect.next();

        System.out.println("What is your last name?");
        String lastName = collect.next();

        System.out.println("What is your year of birth?");
        int birthYear = collect.nextInt();
        int currentYear = 2022;

        System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear - birthYear)+ ".");

        //TASK-3

        System.out.println("What is your full name?");
        collect.nextLine();
        String fullName = collect.nextLine();

        System.out.println("What is your weight in kg?");
        int weight = collect.nextInt();

        System.out.println(fullName + "'s weight is = " + (weight * 2.205) + " lbs.");

        //TASK-4

        System.out.println("What is your full name?");
        collect.nextLine();
        String student1Name = collect.nextLine();
        System.out.println ("What is your age?");
        int student1Age = collect.nextInt();

        System.out.println("What is your full name?");
        collect.nextLine();
        String student2Name = collect.nextLine();
        System.out.println("What is your age?");
        int student2Age = collect.nextInt();

        System.out.println("What is your full name?");
        collect.nextLine();
        String student3Name = collect.nextLine();
        System.out.println("What is your age?");
        int student3Age = collect.nextInt();

        //   int student1And2Age = Math.max (student1Age , student2Age);
        //   int student1And3Age = Math.min(student1Age , student3Age);


        System.out.println(student1Name + "'s age is " + student1Age + ".\n" + student2Name + "'s age is " +
                student2Age + ".\n" + student3Name + "'s age is " + student3Age + ".\nThe average age is " +
                ((student1Age + student2Age + student3Age) / 3) + ".\nThe eldest age is " +
                (Math.max(Math.max(student1Age, student2Age), student3Age)) + ".\nThe youngest age is " +
                (Math.min(Math.min(student1Age, student2Age), student3Age) + "."));

        //(Math.max(Math.max(student1Age, student2Age), student3Age))
    }
}
