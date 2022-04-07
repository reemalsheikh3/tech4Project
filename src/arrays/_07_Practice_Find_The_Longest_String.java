package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "brown", "white"};

        String longestWord = "";
        //String longestWord = colors[0]; //another way means same thing as "";
        for (String color : colors){
            if (color.length() > longestWord.length()) longestWord = color;
        }
        System.out.println(longestWord);
    }
}
