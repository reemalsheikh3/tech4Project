package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        //1.Declaring an Array vs ArrayList
        String[] namesArray = new String[5];

        ArrayList<String> namesList = new ArrayList<>();

        //2. How to print the size of Array vs ArrayList
        System.out.println("\n-----Printing size of Array vs ArrayList");
        System.out.println("Size of the Array = " + namesArray.length); //5
        System.out.println("Size of the ArrayList = " + namesList.size()); //0

        //3. How to add elements to Array vs ArrayList
        namesArray[0] = "Abe";
        namesArray[4] = "Data";
       // namesArray[7] = "John"; Array out of bounds

        namesList.add("Abe"); //add method that takes object
        namesList.add(1, "Data"); //add object to specific index [Abe, Data]
        namesList.add(1, "John"); // [Abe, John, Data]
        namesList.add("Alona"); // [Abe, John, Data, Alona]
        namesList.add("Max"); // [Abe, John, Data, Alona, Max]
        namesList.add(0,"James"); // [James, Abe, John, Data, Alona, Max]

        namesList.set(2, "Lionel"); // [Abe, John, Lionel]

        //4. How to print Array vs ArrayList
        System.out.println(Arrays.toString(namesArray)); //[Abe, null, null, null, Data]
        System.out.println(namesList); // [James, Abe, Lionel, Data, Alona, Max] 0-6

        namesList.add("Andrei");
        System.out.println(namesList); // [James, Abe, Lionel, Data, Alona, Max, Andrei] 0-7

        namesList.add(5, "Taylor"); //  [James, Abe, Lionel, Data, Alona, Taylor, Max, Andrei]
        System.out.println(namesList);

        namesList.set(3, "Daria");
        System.out.println(namesList); // [James, Abe, Lionel, Daria, Alona, Taylor, Max, Andrei]

        System.out.println(namesList.size()); // 8

        //namesList.remove(7) this will remove element at index of 7
        //namesList.remove("James") this will remove James

        //names.List.removeAll(collectionOfElementsToBeRemoved)

        namesList.remove(0); //James
        System.out.println(namesList);

        System.out.println(namesList.remove(2)); //Daria
        System.out.println(namesList); //[Abe, Lionel, Alona, Taylor, Max, Andrei]

        namesList.remove("Alona");
        System.out.println(namesList); //[Abe, Lionel, Taylor, Max, Andrei]

        System.out.println(namesList.remove("Lionel")); //true
        System.out.println(namesList); //[Abe, Taylor, Max, Andrei]

        System.out.println(namesList.remove("max")); //false
        System.out.println(namesList.remove("Melda")); //false
        System.out.println(namesList); //[Abe, Taylor, Max, Andrei]

        System.out.println(namesList.get(3)); // Andrei
        System.out.println(namesList.get(1)); // Taylor

        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add(0, "Regina");

        System.out.println(namesList.indexOf("Abe"));//1
        System.out.println(namesList.indexOf("Regina")); //0
        System.out.println(namesList.lastIndexOf("Regina"));//6

        System.out.println(namesList.contains("Max"));//true
        System.out.println( namesList.contains("Kale"));//false

      //  namesList.removeAll(namesList);
        namesList.clear();
        System.out.println(namesList.size()); //0
    }
}
