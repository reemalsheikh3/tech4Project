package arrays;

public class SecondSmallestOrGreatest {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 7, 1, 1, 7};

        /*
        1, 1, 2, 3, 7, 7
        max = 7
        second max = 3

        min = 1
        second min = 2
         */
        System.out.println("---Finding second min with 2 loops");
        int min = Integer.MAX_VALUE; // 2147483647
        int secondMin = Integer.MAX_VALUE;

        for (int number : numbers){
            if (number < min) min = number;
        }
        for (int number : numbers){
            if (number < secondMin && number != min) secondMin = number;
        }
        System.out.println("The minimum number in the array = " + min);
        System.out.println("The second minimum number in the array = " + secondMin);

        System.out.println("---Finding second min with 1 loop---");
        int smallest = Math.min(numbers[0], numbers[1]);
        int secondSmallest = Math.max(numbers[0], numbers[1]);

        //2, 3, 7, 1, 1, 7
        for (int number : numbers) {
            if (number < secondSmallest && number < smallest){
                secondSmallest = smallest;
                smallest = number;
            }else if (number < secondSmallest && number != smallest) secondSmallest = number;
        }
        System.out.println("The minimum number in the array = " + smallest);
        System.out.println("The second minimum number in the array = " + secondSmallest);

    }
}
