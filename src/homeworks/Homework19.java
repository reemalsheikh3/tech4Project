package homeworks;

import java.util.Arrays;

public class Homework19 {

    //Task-1
    public static String noDigit(String str){
        String newStr = str.replaceAll("[0-9]", "");
        return newStr;
    }

    //Task-2
    public static String noVowel(String str){
        String newStr = str.replaceAll("[aeiouAEIOU]", "");
        return newStr;
    }

    //Task-3
    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        return sum;
    }

    //Task-4
    public static boolean hasUpperCase(String str){
        boolean isUppercase = false;
        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))) {
                isUppercase = true;
                break;
            }
            else isUppercase = false;
        }
        return isUppercase;
    }

    //Task-5
    public static int middleInt(int a, int b, int c){
        if(a == b || b == c) return b;
        else if(a == c) return a;

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        if(a != max && a != min) return a;
        else if(b != max && b != min) return b;
        else return c;
    }

    //Task-6
    public static int[] no13(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 13) newArr[i] = 0;
            else newArr[i] += arr[i];
        }
        return newArr;
    }

    //Task-7
    public static int[] arrFactorial(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == 1) newArr[i] = 1;
            else{
                int factorial = arr[i];
                for (int j = 2; j < factorial; j++) {
                   arr[i] *= i;
                }
                newArr[i] += arr[i];
            }
        }
        return newArr;
    }

//Task-8
    public static String[] categorizeCharacters(String str){
        String[] arr = new String[3];
        String letters = "";
        String digits = "";
        String special = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) digits += str.charAt(i);
            else special += str.charAt(i);
        }
        arr[0] = letters;
        arr[1] = digits;
        arr[2] = special;
        return arr;
    }



    public static void main(String[] args) {
        System.out.println("-----TASK 1-----");
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit(""));
        System.out.println(noDigit("Java"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("123Tech456Global149"));
        System.out.println("-----TASK 2-----");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));
        System.out.println("-----TASK 3-----");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John's age is 29"));
        System.out.println(sumOfDigits("$125.0"));
        System.out.println("-----TASK 4-----");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John's age is 29"));
        System.out.println(hasUpperCase("$125.0"));
        System.out.println("-----TASK 5-----");
        System.out.println(middleInt(1, 1, 1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5, 5, 8));
        System.out.println(middleInt(5, 3, 5));
        System.out.println(middleInt(-1, 25, 10));
        System.out.println("-----TASK 6-----");
        System.out.println(Arrays.toString(no13(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3})));
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13, 13, 13})));
        System.out.println("-----TASK 7-----");
        System.out.println(Arrays.toString(no13(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(no13(new int[]{0, 2, 4, 1})));
        System.out.println(Arrays.toString(no13(new int[]{5, 0, 6})));
        System.out.println("-----TASK 8-----");
        System.out.println(Arrays.toString(categorizeCharacters("   ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));
    }
}
