package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args) {

        /*
        1. declare and assign the 3 given numbers
        2. Find max and min of all 3 numbers 2 at a time
         */

        int x = 4, y = 67, z = -54;

       // int minOfXY = Math.min(x,y);
       // int minOfXYZ = Math.min(minOfXY,z);

      //  int maxOfXY = Math.max(x,y);
      //  int maxOfXYZ = Math.max(maxOfXY,z);

       Math.max(x,y);
   //     Math.min(x,y);

        System.out.println("The maximum of XYZ variables = " + Math.max(Math.max(x,y), z));
        System.out.println("The minimum of XYZ variables = " + Math.min(Math.min(4,67), -54));


        System.out.println("The maximum of the 3 given numbers is = " + Math.max(Math.max(4,56),23));

        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter 4 numbers.");
        int num1 = collect.nextInt(), num2 = collect.nextInt(), num3 = collect.nextInt(), num4 = collect.nextInt();

        System.out.println("The maximum of the 4 numbers is = " + Math.max(Math.max(num1, num2), Math.max(num3, num4)));
        System.out.println("The minimum of the 4 numbers is = " + Math.min(Math.min(num1,num2), Math.min(num3,num4)));
    }
}
