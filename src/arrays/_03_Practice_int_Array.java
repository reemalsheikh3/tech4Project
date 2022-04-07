package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {
        /*
        Create an int array
         */
        System.out.println("----Task 1----");
        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println("Array is not sorted = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));

        System.out.println("----Task 2----");
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;
        for (int digit : numbers){
            if (digit > 0) countPositive++;
            else if (digit < 0) countNegative++;
            else countZeros++;
        }
        System.out.println("Positives = " + countPositive);
        System.out.println("Negatives = " + countNegative);
        System.out.println("Zeros = " + countZeros);

        System.out.println("----Task 3----");
        int countEven = 0;
        int countOdd = 0;
        for (int digit : numbers){
            if (digit % 2 == 0) countEven++;
            else countOdd++;
        }
        System.out.println("Evens = " + countEven);
        System.out.println("Odds = " + countOdd);


    }
}
