package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {
        /*
        int [] numbers = {5, 3, 0, -5};

        Find the greatest and print it
         */
        System.out.println("---TASK 1 solution 1---");
        int [] numbers = {5, 3, 0, -5};
      //  Arrays.sort(numbers);
      //  System.out.println(numbers[numbers.length-1]);

        System.out.println("---TASK 1 best logical solution---");
        int max = numbers[0];
        for (int num : numbers){
            //if (num > max) max = num; // 1st way:
            max = Math.max(max, num); //2nd way:
        }
        System.out.println(max);

        System.out.println("---TASK 2---");
        double[] numbersT2 = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double min = numbersT2[0];
        for (double element : numbersT2){
            if (element < min) min = element;
        }
        System.out.println(min);

        System.out.println("---TASK 3---");
        double secondMin = numbersT2[0];
        for (double number : numbersT2){
            if (number != min && number < secondMin) secondMin = number;
        }
        System.out.println(secondMin);
        }

    }

