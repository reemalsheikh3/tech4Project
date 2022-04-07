package homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("---TASK 1---");
        String s1 = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) s1 += i + " - ";
        }
        System.out.println(s1.substring(0, s1.length() - 3) + "\n");

        System.out.println("---TASK 2---");
        String s2 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 3 == 0) s2 += i + " - ";
        }
        System.out.println(s2.substring(0, s2.length() - 3) + "\n");

        System.out.println("---TASK 3---");
        String s3 = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) s3 += i + " - ";
        }
        System.out.println(s3.substring(0, s3.length() - 3) + "\n");

        System.out.println("---TASK 4---");
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);
        }
        System.out.println("---TASK 5---");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("---TASK 6---");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int positiveNum = input.nextInt();
        input.nextLine();
        int factorial = 1;
        for (int i = 1; i <= positiveNum; i++) {
            if (positiveNum > 0) factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("---TASK 7---");
        System.out.println("Please enter your first and last name");
        String firstAndLastName = input.nextLine();
        int vowel = 0;

        for (int i = 0; i < firstAndLastName.length(); i++) {
            if (firstAndLastName.toLowerCase().charAt(i) == 'a' || firstAndLastName.toLowerCase().charAt(i) == 'e'
                    || firstAndLastName.toLowerCase().charAt(i) == 'i' || firstAndLastName.toLowerCase().charAt(i) == 'o'
                    || firstAndLastName.toLowerCase().charAt(i) == 'u') {
                vowel++;
            }
        }
        System.out.println("There are " + vowel + " vowel letters in this full name");

        System.out.println("---TASK 8---");
        int sum8 = 0; //for getting sum of given numbers
        int n = 0; //for getting number from user
        int attempt = 1; // for checking how many times the loop runs
        do {
            System.out.println("Please enter number");
            n = input.nextInt();

            if (attempt == 1 && n >= 100){
                System.out.println("This number is already more than 100");
                break;
            }else{
                sum8 += n;
                if (sum8 >= 100){
                    System.out.println("Sum of entered numbers is at least 100");
                }
            }
            attempt++; //for updating how many TIMES we ran the loop
        } while (sum8 < 100);
        input.nextLine();

        System.out.println("---TASK 9---");
        System.out.println("Given number: ");
        int n9 = input.nextInt();
        input.nextLine();
        int start0 = 0;
        int start1 = 1;
        for (int i = 1; i <= n9; ++i){
            System.out.print(start0 + " ");
            int sumOfPrevTwo = start0 + start1;
            start0 = start1;
            start1 = sumOfPrevTwo;
            System.out.println("\n");
        }


        System.out.println("---TASK 10---");
        System.out.println("Please enter a name");
        String name = input.nextLine();

        do {
            if (!(name.toLowerCase().startsWith("j"))){
                System.out.println("Please enter a name");
                name = input.nextLine();
            }
        } while (!(name.toLowerCase().startsWith("j")));
        System.out.println("End of the program");
    }
}
