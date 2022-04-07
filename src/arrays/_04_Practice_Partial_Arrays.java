package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */

        System.out.println("---TASK 1---");
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for (int num : numbers) {
            System.out.println(num);
        }

        /*
        TASK-2
        Find the sum of all the elements

        RESULT:
        29
        */
        System.out.println("---TASK 2 for each loop---");
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        System.out.println(sum);

        System.out.println("---TASK 2 fori loop---");
        int sumT2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumT2 += numbers[i];
        }
        System.out.println(sumT2);

        System.out.println("---TASK 3---");
        int sumT3 = 0;
        for (int i = 0; i <= 2; i++) {
            sumT3 += numbers[i];
        }
        System.out.println(sumT3);

        System.out.println("---TASK 4---");
        int sumT4 = 0;
        for (int i = numbers.length-5; i < numbers.length ; i++) {
            sumT4 += numbers[i];
        }
        System.out.println(sumT4);

        System.out.println("---TASK 5---");
        int product = 1;
        for (int i = numbers.length-4; i < numbers.length; i++) {
            int n = numbers[i];
            if (n != 0) product *= n;
        }
        System.out.println(product);

        System.out.println("---TASK 6---");
        boolean isZero = false;
        for (int number : numbers) {
            if (number == 0) {
                isZero = true;
                break;
            }
        }
        System.out.println(isZero);
    }
}
