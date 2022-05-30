package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Homework20 {

    //TASK-1
    public static boolean hasLowercase(String str){
        boolean isLowercase = false;
        for (int i = 0; i < str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))) {
                isLowercase = true;
                break;
            }else isLowercase = false;
        }
        return isLowercase;
    }

    //TASK-2
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
        numbers.removeIf(number -> number == 0);
        return numbers;
    }

    //TASK-3
    public static int[][] numberAndSquare(int[] arr){
        int[][] numberGroups = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++){
            numberGroups[i][0] = arr[i];
            numberGroups[i][1] = arr[i] * arr[i];
        }
        return numberGroups;
    }

    //TASK-4
    public static boolean containsValue(String [] arr, String str){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, str) >= 0; //if element is in the array it will return 0 or > than 0 if not it will return -number
    }

    //TASK-5
    public static String reverseSentence(String str){
        String[] words = str.split(" ");
        if (words.length < 2) return "There is not enough words";
        else {
            words[0] = (words[0].charAt(0) + "").toLowerCase() + words[0].substring(1);
            words[words.length - 1] = (words[words.length -1].charAt(0) + "").toUpperCase() + words[words.length -1].substring(1);
            String reverse = "";
            for (int i = words.length -1; i >= 0; i--){
                reverse += words[i] + " ";
            }
            return reverse;
        }
    }

    //TASK-6
    public static String removeStringSpecialsDigits(String str){
        str = str.replaceAll("[^a-zA-Z ]", "");
        return str;
    }

    //TASK-7
    public static String[] removeArraySpecialsDigits(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^a-zA-Z ]", "");
        }
        return arr;
    }

    //TASK-8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
       ArrayList<String> commons = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i).equals(arr2.get(j)) && (!commons.contains(arr1.get(i)))) {
                    commons.add(arr1.get(i));
                }
            }
        }
        return commons;
    }

    //TASK-9
    public static ArrayList<String> noXInVariables(ArrayList<String> arrList){
        ArrayList<String> noXs = new ArrayList<>();
        for (String element : arrList){
            if (!element.toLowerCase().equals("x") && element.toLowerCase().contains("x")) {
                element = element.replaceAll("[xX]", "");
                noXs.add(element);
            }
            else noXs.add(element);
        }
        return noXs;
    }

    public static void main(String[] args) {
        System.out.println(hasLowercase(""));
        System.out.println(hasLowercase("JAVA"));
        System.out.println(hasLowercase("125$"));
        System.out.println(hasLowercase("hello"));
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(10);
        System.out.println(noZero(numbers));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));
        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "java", "hello"}, "123"));
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "“###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("is");
        list1.add("fun");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("C#");
        list2.add("Python");
        System.out.println(removeAndReturnCommons(new ArrayList<>(list1), new ArrayList<>(list2)));

        ArrayList<String> list = new ArrayList<>();
        list.add("xyXyxy");
        list.add("Xx");
        list.add("ABC");
        System.out.println(noXInVariables(new ArrayList<>(list)));
    }
}


