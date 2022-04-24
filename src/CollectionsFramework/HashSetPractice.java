package CollectionsFramework;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        /*
        How to create a HashSet
         */

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);

        System.out.println(numbers); //not in any specific order [0, null, -3, 5, -7, -55, 10] will ignore any duplicates

    }
}
