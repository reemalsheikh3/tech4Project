package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("---TASK 1---");
        int [] numbersT1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      for (int number : numbersT1){
          if (number % 2 == 0 && number % 5 == 0){
              System.out.println("FooBar");
          }
          else if (number % 2 == 0) System.out.println("Foo");
          else if (number % 5 == 0) System.out.println("Bar");
          else System.out.println(number);
      }
        System.out.println("---TASK 2---");
      int[] numbersT2 = {0, -4, -7, 0, 5, 10, 45};
      boolean isPositive = false;
      boolean isNegative = false;
      int countPositive = 0;
      int countNegative = 0;
      for (int number : numbersT2){
          if (number > 0  && countPositive == 0) {
              System.out.println("First positive number is: " + number);
              isPositive = true;
              countPositive++;
          }else if (number < 0  && countNegative == 0){
              System.out.println("First negative number is: " + number);
              isNegative = true;
              countNegative++;
          }
          if (isNegative && isPositive) break;
      }
        System.out.println("---TASK 3---");
      int random1 = (int) (Math.random()*10 +1);
      int random2 = (int) (Math.random()*10 +1);
      int random3 = (int) (Math.random()*10 +1);
      int random4 = (int) (Math.random()*10 +1);
      int random5 = (int) (Math.random()*10 +1);
      int[] randomNumbers = {random1, random2, random3, random4, random5};
      boolean contains2or3 = false;
      for (int numbers : randomNumbers){
          if (numbers == 2 || numbers == 3) {
              contains2or3 = true;
              break;
          }
      }
        System.out.println(contains2or3);

        System.out.println("---TASK 4---");
        //String[] list = {"pineapple", "banana", "orange", "grapes"}; //can change String array to be anything and code is dynamic
        String[] list = {"banana", "Orange", "Apple"};
        boolean containsApple = false;
        for (String elements : list){
            if (elements.equalsIgnoreCase("apple")) {
                containsApple = true;
                break;
            }
        }
        System.out.println(containsApple);
        System.out.println("---TASK 5---");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean MatchingElements = false;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]){
                    System.out.println(numbers1[i]);
                    MatchingElements = true;
                }
            }
        }
        if (!MatchingElements)System.out.println("There is no matching elements");
        System.out.println("---TASK 6---");

        String str = "baNana";
        char [] newStr = str.toLowerCase().toCharArray();
        boolean duplicateCharacters = false;
        String duplicated = "";
        for (int i = 0; i < newStr.length; i++) {
            for (int j = i + 1; j < newStr.length; j++) {
                if (!(duplicated.contains(newStr[i] + "")) && newStr[i] == (newStr[j])) {
                    duplicated += newStr[i];
                    duplicateCharacters = true;
                    System.out.println(newStr[i]);
                }
            }


        }
    }
}
