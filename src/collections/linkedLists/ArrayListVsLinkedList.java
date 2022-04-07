package collections.linkedLists;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.5);
        numbers.add(17.7);
        System.out.println(numbers); // [10.5, 12.5, 13.3, 17.7]
        System.out.println("----LOOPING LINKED LIST ----");
        for (Double d : numbers){
            System.out.println(d);
        }
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("---Some methods of Linked List----");
        System.out.println(numbers.get(0)); //10.5
        System.out.println(numbers.getFirst()); //10.5
        System.out.println(numbers.getLast()); //17.7

        System.out.println("---Some additional methods of Linked List----");
        System.out.println(numbers.peek()); //another way to get first element getFirst();
        System.out.println(numbers.peekFirst()); //another way to get first element getFirst();
        System.out.println(numbers.peekLast());//another way to get last element getLast();

        System.out.println(numbers); //[10.5, 12.5, 13.5, 17.7]
        System.out.println("----------------------------------------------");
        System.out.println(numbers.poll()); //retrieves the first element and removes it
        System.out.println(numbers.pollFirst()); //retrieves the first element and removes it
        System.out.println(numbers.pollLast()); //retrieves the last element and removes it

        System.out.println("----------------------------------------------");
        numbers.push(5.7); //Adds the object to the beginning or head of the list
        numbers.push(8.9);
        numbers.pop(); // removes the first element
        System.out.println(numbers);
    }
}
