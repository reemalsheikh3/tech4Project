package loops;


import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {
        System.out.println("\n---Fori Loop---\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter");
        int totalNumbers = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= totalNumbers; i++){
            System.out.println("Please enter number " + i);
            sum += scan.nextInt();
        }
        System.out.println(sum);

        System.out.println("\n---While Loop---\n");
        System.out.println("Please enter how many numbers you want to enter");
        int times = scan.nextInt();
        int count = 1;
        int sum2 = 0;

        while(count <= times){
            System.out.println("Please enter number " + count);
            sum2 += scan.nextInt();
            count++;
        }
        System.out.println(sum2);
    }

}
