package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        String[] cities = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};
        System.out.println(Arrays.toString(cities));
        List<String> citiesT1 = new LinkedList<>(Arrays.asList(cities));
        citiesT1.remove("Miami");
        citiesT1.remove("Dallas");
        System.out.println(citiesT1);
    }
}
