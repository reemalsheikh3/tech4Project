package CollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {
        /*
        String - String
        Key - value
        Ukraine -> Kiev
        Spain ->  Madrid
        Portugal -> Lisbon
        Italy -> Roma
        US -> DC
        Canada -> Ottawa
         */

        System.out.println("\n----Understanding Map----\n");
        TreeMap<String, String> capitals = new TreeMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Roma");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");

        //Printing a HashMap -> {Canada=Ottawa, Ukraine=Kiev, Italy=Roma, Portugal=Lisbon, US=DC, Spain=Madrid}
        //Printing a LinkedHashMap (saves insertion order)-> {Ukraine=Kiev, Spain=Madrid, Portugal=Lisbon, Italy=Roma, US=DC, Canada=Ottawa}
        //Printing a TreeMap (keys are sorted alphabetical) -> {Canada=Ottawa, Italy=Roma, Portugal=Lisbon, Spain=Madrid, US=DC, Ukraine=Kiev}
        System.out.println(capitals);

        //How to get a particular key-value pair --> can only get value not key! because values can be duplicated so it wouldn't work
        System.out.println(capitals.get("Spain")); //Madrid
        System.out.println(capitals.get("Germany")); //null -> does not exist
        System.out.println(capitals.get("us")); //null -> does not exist

        System.out.println("\n----Understanding HashMap----\n");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(4, "Data");
        students.put(null, "John");
        students.put(null, "Alex"); //replaces John with Alex because same null key - size stays the same
        students.put(5, null);
        students.put(6, null);
        students.put(7, null);
        students.put(null, null); //replace Alex with null because same null key - size stays the same



        System.out.println(students.size()); // 8
        System.out.println(students); // {null=null, 1=Alona, 2=Abdullah, 3=Abdullah, 4=Data, 5=null, 6=null, 7=null}
    }
}
