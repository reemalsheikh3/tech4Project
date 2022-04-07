package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {

    //TASK-1
    public static void findGreatestAndSmallestWithSort (int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0] + "\nGreatest = " + numbers[numbers.length-1]);
    }
    //TASK-2
    public static void findGreatestAndSmallest (int[] numbers){
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        System.out.println("Smallest = " + min + "\nGreatest = " + max);
    }
    //TASK-3
    public static void findSecondGreatestAndSmallestWithSort (int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Second Smallest = " + numbers[1] + "\nSecond Greatest = " + numbers[numbers.length-2]);
    }
    //TASK-4
    public static void findSecondGreatestAndSmallest (int[] numbers){
        int max1st = numbers[0];
        int max2nd = numbers[0];
        int min1st = numbers[0];
        int min2nd = numbers[0];
        for (int num : numbers){
            min1st = Math.min(min1st, num);
            min2nd = Math.min(min2nd, num);
            max1st = Math.max(max1st, num);
            max2nd = Math.max(max2nd, num);
        }
        for (int i = 0; i < numbers.length; i++){
            if (min2nd < numbers[i] && numbers[i] != min1st) numbers[i] = min2nd;
            if (max2nd > numbers[i] && numbers[i] != max1st) numbers[i] = max2nd;
        }
        System.out.println("Second Smallest = " + min2nd + "\nSecond Greatest = " + max2nd);
    }
    //TASK-5
    public static void findDuplicatedElementsInAnArray (String[] s){
        String duplicate = "";
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j])){
                    System.out.println(s[i]);
                }
            }
        }
    }

    //TASK-6
    public static void findMostRepeatedElementInAnArray (String[] string) {
        String element = "";
        int count = 0;
        Arrays.sort(string);
        for (int i = 0; i < string.length; i++) {
            String tempElement = string[i];
            int tempCount = 0;
            for (int j = 0; j < string.length; j++) {
                if (string[j].equals(tempElement)) tempCount++;
                if (tempCount > count) {
                    element = tempElement;
                    count = tempCount;
                }
            }
        }
        System.out.println(element);
    }

    //TASK-6 IN CLASS
    public static void findMostRepeatedElementInAnArrayAgain (String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }

    public static void main(String[] args){
        String[] s = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser", "eraser", "eraser"};
        Project07.findMostRepeatedElementInAnArrayAgain(s);
    }

}
