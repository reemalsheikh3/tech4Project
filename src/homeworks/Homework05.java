package homeworks;
import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args){
        //TASK-1
        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter 3 numbers.");
        int n1 = collect.nextInt();
        int n2 = collect.nextInt();
        int n3 = collect.nextInt();
        System.out.println("Max value = " + (Math.max(Math.max(n1,n2),n3)) + "\nMin value = " +
                (Math.min(Math.min(n1,n2),n3)));

        //TASK-2
        System.out.println("Please enter 5 numbers.");
        int num1 = collect.nextInt(), num2 = collect.nextInt(), num3 = collect.nextInt(),
                num4 = collect.nextInt(), num5 = collect.nextInt();
        System.out.println("Max value = " + (Math.max(Math.max(Math.max(Math.max(num1,num2),num3),num4),num5)) +
                "\nMin value = " + (Math.min(Math.min(Math.min(Math.min(num1,num2),num3),num4),num5)));

        //TASK-3
        System.out.println("Please enter 2 numbers.");
        int number1 = collect.nextInt(), number2 = collect.nextInt();
        System.out.println("The difference between numbers is = " + (Math.abs(number1 - number2)));

        //TASK-4
        int randomNumber1Between50And100 = (int) (Math.random() * 51) + 50;
        int randomNumber2Between50And100 = (int) (Math.random() * 51) + 50;
        int randomNumber3Between50And100 = (int) (Math.random() * 51) + 50;

        System.out.println("Number 1 = " + randomNumber1Between50And100+ "\nNumber 2 = " + randomNumber2Between50And100
        + "\nNumber 3 = " + randomNumber3Between50And100 + "\nThe sum of numbers if = " +
                (randomNumber1Between50And100 + randomNumber2Between50And100 + randomNumber3Between50And100));

        //TASK-5
        double alexMoney = 125;
        double mikeMoney = 220;
        System.out.println("Alex's money: $" + (alexMoney - 25.5) + "\nMike's money: " + (mikeMoney + 25.5));

        //TASK-6
        double amountForBike = 390, savePerDay = 15.60;
        System.out.println((int) (amountForBike / savePerDay));
    }
}
