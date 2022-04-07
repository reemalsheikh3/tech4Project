package collections.arrayLists;

import java.util.*;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        System.out.println("---TASK 1---");
        languages.remove("Python");
        System.out.println(languages);

        System.out.println("---TASK 2---");
        /*
        List<String> startedWithJ = new LinkedList<>();
        for (String language : languages){
            if (language.charAt(0) == 'J') startedWithJ.add(language);
        }
        languages.removeAll(startedWithJ);
        System.out.println(languages);
        /
         */
        /*
        languages.removeIf(x -> x.startsWith("J"));
        System.out.println(languages);

         */

        //USING ITERATOR
        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while (iterator.hasNext()){ //We are asking if there is an element in the queue
            String element = iterator.next(); //this gets an element from the queue
            if(element.startsWith("J"))iterator.remove(); // if element came from the queue starts with J -> remove
        }
        System.out.println(languages);
    }
}
