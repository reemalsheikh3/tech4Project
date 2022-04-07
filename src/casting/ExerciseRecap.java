package casting;
import java.util.Scanner;
public class ExerciseRecap {
    public static void main(String[] args){
        /*
        Write a program ASKS user for 5 of their grades as string
        and print out their avg

        Input:
        "45"
        "50"
        "55"
        "60"
        "65"

        Output:
        55
         */

        Scanner collect = new Scanner(System.in);
        System.out.println("Please enter 5 of your grade percentages.");

        double g1D = Double.parseDouble(collect.next()), g2D = Double.parseDouble(collect.next()), g3D = Double.parseDouble(collect.next()),
        g4D = Double.parseDouble(collect.next()), g5D = Double.parseDouble(collect.next());

        System.out.println("The average of all 5 grades entered is: " +((int)(g1D + g2D + g3D + g4D + g5D) / 5));

        //Task-2
        System.out.println("What is your balance?");
        String balance = collect.next();
        System.out.println("What is your next 3 transactions?");
        String t1 = collect.next(), t2 = collect.next(), t3 = collect.next();
        double balanceD = Double.parseDouble(balance), t1D = Double.parseDouble(t1), t2D = Double.parseDouble(t2),
                t3D = Double.parseDouble(t3);
        System.out.println("Your balance is now= " + (balanceD - (t1D + t2D + t3D)));

        //Task-3
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name.");
        String fullName = input.nextLine();
        System.out.println("Please enter your age.");
        String age = input.next();
        System.out.println("Please enter your phone number.");
        input.nextLine();
        String phoneNumber = input.nextLine();

        System.out.println("Please enter the ages of your kids.");
        int kid1Age = Integer.parseInt(input.next()), kid2Age = Integer.parseInt(input.next()),
                kid3Age = Integer.parseInt(input.next());

        int maxAge = (Math.max(Math.max(kid1Age, kid2Age), kid3Age));
        int minAge = (Math.min(Math.min(kid1Age, kid2Age), kid3Age));

        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber + ",\nYou are " +
                age + " years old, Your oldest kid is " + maxAge + " years old, " + "your \nyoungest is " +
                minAge + ", difference between oldest and youngest is " + Math.abs(maxAge - minAge) + "\nyears.");

    }
}
