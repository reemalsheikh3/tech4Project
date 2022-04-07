package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {
        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");
        System.out.println( "German Cars = " + germanCars);

        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");
        System.out.println("Japanese cars = " + japaneseCars);

        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");
        System.out.println("Luxury Cars = " + luxuryCars);

        System.out.println("\n---Put all together---\n");
        ArrayList<String> inventory = new ArrayList<>(); //[]
        System.out.println("Inventory at the beginning = " + inventory); //[]

        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars = " + inventory);
        /*
        Inventory after adding german cars = [BMW, Mercedes, Volkswagen]
         */

        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);
        /*
        Inventory after adding luxury cars = [BMW, Mercedes, Volkswagen, Maserati, Tesla, Range Rover, Jaguar]
         */

        inventory.addAll(1, japaneseCars); // each element has its own index not by collection
        System.out.println("Inventory after adding japanese cars = " + inventory);
        /*
        Inventory after adding japanese cars = [BMW, Honda, Toyota, Lexus, Mercedes, Volkswagen, Maserati,
        Tesla, Range Rover, Jaguar]
         */

        //Remove all japanese cars from inventory
        inventory.removeAll(japaneseCars);
        System.out.println("Inventory after removing japanese cars = " + inventory);
        /*
        Inventory after removing japanese cars = [BMW, Mercedes, Volkswagen, Maserati, Tesla, Range Rover, Jaguar]
         */

        //Remove tesla, audi, and BMW
        //CAN'T use loops for this!!**
        inventory.remove("Audi");
        inventory.remove("Tesla");
        inventory.remove("BMW");
        System.out.println(inventory);

    }
}
