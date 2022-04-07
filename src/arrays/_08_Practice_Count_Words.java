package arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        /*
        TASK-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday";

         */
        System.out.println("---TASK 1---");
        String s1 = "Today is Tuesday";
        String[] splitSpaces = s1.split(" ");

        System.out.println(splitSpaces.length);

        System.out.println("---TASK 2---");

        String s2 = "Some countries I visited were Argentina, Belgium, and Malta";

        String[] splitSpaces2 = s2.split(" ");
        int count = 0;
        for (int i = 0; i < splitSpaces2.length; i++) {
            if (splitSpaces2[i].charAt(0) == 'A' || splitSpaces2[i].charAt(0) == 'a') count++;
        }
        System.out.println(count);

    }
}
