package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("pencil");

        List<String> uniques = new ArrayList<>();
        for (String word : objects){
           if (!uniques.contains(word)) uniques.add(word);
        }
        System.out.println(uniques);

    }
}
