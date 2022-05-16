package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HomeworkR4 {
   //TASK-1
    public static String noSpace(String str){
        String noSpaces = str.replaceAll(" ", "");
        return noSpaces;
    }

    //Task-2
    public static String replaceFirstLast(String str){
       if (str.trim().length() < 2) return "";
       else return str.substring(str.length()-1) + str.substring(1,str.length()-1) + str.substring(0,1);
    }

    //Task-3
    public static boolean hasVowel(String str){
       if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
               str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) return true;
       else return false;
    }

    //Task-4
    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));
        if (currentYear < yearOfBirth || (currentYear - yearOfBirth) > 100) System.out.println("AGE IS NOT VALID");
        else if ((currentYear - yearOfBirth) < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }

    //Task-5
    public static int averageOfEdges(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max+min)/2;
    }

    //Task-6
    public static String noA(String[] arr){
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].toUpperCase().charAt(0) == 'A') newArr[i] = "###";
            else newArr[i] = arr[i];
        }
        return Arrays.toString(newArr);
    }

    //Task-7
    public static String no3or5(int[] numbers){
        int[] newArr = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if ((numbers[i] % 5 == 0) && (numbers[i] % 3 == 0)) newArr[i] = 101;
            else if ((numbers[i] % 5 == 0)) newArr[i] = 99;
            else if(numbers[i] % 3 == 0) newArr[i] = 100;
            else newArr [i] = numbers[i];
        }
        return Arrays.toString(newArr);
    }

    //Task-8
    public static int countPrimes(int[] numbers){
        int count = 0;
        for (int number : numbers){
            if (number == 2 || number == 3) count++;
            else if (number > 3){
                boolean isPrime = true;
                for (int i = 2; i <= number / 2; i++){
                    if (number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(noSpace("   Hello   "));
        System.out.println(replaceFirstLast("Tech Global"));
        System.out.println(hasVowel("123"));
        checkAge(2030);
        averageOfEdges(10, 13, 20);
        String [] test = {"appium", "123", "ABC", "java"};
        System.out.println(noA(test));
        int [] test2 = {41,53,19,47,67};
        System.out.println(no3or5(test2));
        System.out.println(countPrimes(test2));
    }
}

