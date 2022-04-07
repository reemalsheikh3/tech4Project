package stringMethods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /*
        Method Task: They are used to find the index or the last index of some char or String values in another string
        -They are non-static methods and called with another String object
        -They are return type, and they return int as index
        -They take either String or char as arguments

        Note: if the given char or String does not exist, then they return -1
        Note: if you are looking for an index of String, and it exists, it will return the first index of found match
         */

        String sentence = "I like Chicago and Miami more than any other cities";

        System.out.println(sentence.indexOf('C')); // 7
        System.out.println(sentence.indexOf('c')); // 10
        System.out.println(sentence.lastIndexOf('c')); // 45


        sentence.indexOf("Chicago"); // 7
        sentence.indexOf("Miami"); // 19

        sentence.indexOf("chicago"); // -1 Doesn't exist
        System.out.println("The index of empty = " + sentence.indexOf("")); // 0


    }
}
