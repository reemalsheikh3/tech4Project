package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {
    public static int countWords(String str){
        String[] s = str.trim().split(" ");
        return s.length;
    }

    public static int countA(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') count++;
        }
        return count;
    }

    public static int countPos(ArrayList<Integer> arr){
        int count = 0;
        for (Integer number : arr){
            if (number > 0) count++;
        }
        return count;
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> arr){
        ArrayList<Integer> removedDuplicateNumbers = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
                if (!removedDuplicateNumbers.contains(arr.get(i))) {
                    removedDuplicateNumbers.add(arr.get(i));
            }
        }
        return removedDuplicateNumbers;
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){
        ArrayList<String> removedDuplicateElements = new ArrayList<>();
        for (int i = 0; i < str.size(); i++){
                if (!removedDuplicateElements.contains(str.get(i))){
                    removedDuplicateElements.add(str.get(i));
            }
        }
        return removedDuplicateElements;
    }

    public static String removeExtraSpaces(String s){
        s = s.trim();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' || s.charAt(i+1) != ' ') str += s.charAt(i);
        }
        return str;
    }

    public static String add(int[] x, int[] y){
        int[] newArr = new int[Math.max(x.length, y.length)];
        for (int i = 0; i < Math.min(x.length, y.length); i++) {
            newArr[i] = (x[i] + y[i]);
        }
        for (int i = Math.min(x.length, y.length); i < Math.max(x.length, y.length) ; i++) {
            if (Math.max(x.length, y.length) == y.length) newArr[i] = y[i];
            else newArr[i] = x[i];
        }
        return Arrays.toString(newArr);
    }

    public static int findClosestTo10(int[] arr){
        int closest = Integer.MIN_VALUE;
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ((Math.abs(arr[i] - 10)) < distance && arr[i] != 10){
                distance = Math.abs(arr[i] - 10);
                closest = arr[i];
            } else if ((Math.abs(arr[i] - 10)) == distance){
                if (closest > arr[i] && arr[i] != 10) closest = arr[i];
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        //System.out.println(countWords("      Java is fun       "));
       // System.out.println(countWords("Selenium is the most common UI automation tool.   "));
        //System.out.println(countA("TechGlobal is a QA bootcamp"));
        //System.out.println(countA("QA stands for Quality Assurance"));
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(35);
        nums.add(20);
        nums.add(35);
        nums.add(60);
        nums.add(70);
        nums.add(60);
      //  System.out.println(countPos(nums));
        System.out.println(removeDuplicateNumbers(nums));
        ArrayList<String> s = new ArrayList<>();
        s.add("java");
        s.add("C#");
        s.add("ruby");
        s.add("JAVA");
        s.add("ruby");
        s.add("C#");
        s.add("C++");
        System.out.println(removeDuplicateElements(s));
        System.out.println(removeExtraSpaces("  I   am      learning     Java     "));
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(add(arr1,arr2));
        //int[]num = {10, -13, 5, 70, 15, 57};
        int[]num = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(num));

    }
}
