package CollectionsFramework;

import java.util.*;

public class Map_Methods {
    public static void main(String[] args) {
        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        //Keys: Day, Color, City, Car, Pet
        //Values: Friday, Black, Chicago, Lexus, Turtle

        Set<String> keys = favorites.keySet();
        System.out.println(keys); //[Car, Color, City, Day, Pet]

        Collection<String> values = favorites.values();
        System.out.println(values); //[Lexus, Black, Chicago, Friday, Turtle]

        System.out.println(values.stream().filter(element -> element.length() >5).count()); //3
        System.out.println(keys.stream().filter(element -> element.toLowerCase().startsWith("c")).count()); //3
        /*
        int count =0;
        for (String value : values) {
            if (value.length() > 5) count++;
        }
        System.out.println(count);
         */

        /*
        Entry = key-value
         */

        Set<Map.Entry<String, String>> entries = favorites.entrySet();
        for (Map.Entry<String, String> entry : entries){
            System.out.println("My favorite " + entry.getKey() + " is = " + entry.getValue());
        }

        favorites.remove("Day");
        favorites.remove("Pet", "Turtle");
        System.out.println(favorites); //{Car=Lexus, Color=Black, City=Chicago}

        favorites.replace("Car", "Tesla");
        System.out.println(favorites); //{Car=Tesla, Color=Black, City=Chicago}

        System.out.println(favorites.containsKey("Color")); //true
        System.out.println(favorites.containsKey("Sport")); // false
        System.out.println(favorites.containsValue("Tesla")); // true
        System.out.println(favorites.containsValue("Ice-Cream")); //false
    }
}
