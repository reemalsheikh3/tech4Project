package homeworks;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("----TASK 1----");
        List<Integer> numbersT1 = new ArrayList<>();
        numbersT1.add(10);
        numbersT1.add(23);
        numbersT1.add(67);
        numbersT1.add(23);
        numbersT1.add(78);
        System.out.println(numbersT1.get(3));
        System.out.println(numbersT1.get(0));
        System.out.println(numbersT1.get(2));
        System.out.println(numbersT1);

        System.out.println("----TASK 2----");
        List<String> colorsT2 = new ArrayList<>();
        colorsT2.add("Blue");
        colorsT2.add("Brown");
        colorsT2.add("Red");
        colorsT2.add("White");
        colorsT2.add("Black");
        colorsT2.add("Purple");
        System.out.println(colorsT2.get(1));
        System.out.println(colorsT2.get(3));
        System.out.println(colorsT2.get(5));
        System.out.println(colorsT2);

        System.out.println("----TASK 3----");
        List<Integer> numbersT3 = new ArrayList<>();
        numbersT3.add(23);
        numbersT3.add(-34);
        numbersT3.add(-56);
        numbersT3.add(0);
        numbersT3.add(89);
        numbersT3.add(100);
        System.out.println(numbersT3);
        Collections.sort(numbersT3);
        System.out.println(numbersT3);

        System.out.println("----TASK 4----");
        List<String> citiesT4 = new ArrayList<>();
        citiesT4.add("Istanbul");
        citiesT4.add("Berlin");
        citiesT4.add("Madrid");
        citiesT4.add("Paris");
        System.out.println(citiesT4);
        Collections.sort(citiesT4);
        System.out.println(citiesT4);

        System.out.println("----TASK 5----");
        List<String> marvelCharacters = new ArrayList<>();
        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panther");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");
        System.out.println(marvelCharacters);
        boolean containsWolverine = false;
        for (String character : marvelCharacters){
            if (character.equalsIgnoreCase("Wolverine")) containsWolverine = true;
        }
        System.out.println(containsWolverine);

        System.out.println("----TASK 6----");
        List<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");
        Collections.sort(avengers);
        System.out.println(avengers);
        boolean containsHulk = false;
        boolean containsIronMan = false;
        for (String avenger : avengers){
            if (avenger.equalsIgnoreCase("Hulk")) containsHulk = true;
            if (avenger.toLowerCase().contains("iron man")) containsIronMan = true;

        }
    if (containsHulk && containsIronMan) System.out.println(true);
    else System.out.println(false);

        System.out.println("----TASK 7----");
        List<Character> charactersList = new ArrayList<>();
        charactersList.add('A');
        charactersList.add('x');
        charactersList.add('$');
        charactersList.add('%');
        charactersList.add('9');
        charactersList.add('*');
        charactersList.add('+');
        charactersList.add('F');
        charactersList.add('G');
        System.out.println(charactersList);
        for (Character character : charactersList){
            System.out.println(character);
        }

        System.out.println("----TASK 8----");
        List<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);
        int countM = 0;
        int countDoesNotContainAorE = 0;
        for (String object : objects){
            if (object.toLowerCase().startsWith("m")) countM++;
            if (!(object.toLowerCase().contains("a"))){
                if (!(object.toLowerCase().contains("e"))){
                    countDoesNotContainAorE++;
                }
            }
        }
        System.out.println(countM);
        System.out.println(countDoesNotContainAorE);

        System.out.println("----TASK 9----");
        List<String> kitchenObjects = new ArrayList<>();
        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");
        System.out.println(kitchenObjects);
        int countUppercase = 0, countLowercase = 0, countP = 0, countStartsWithorEndsWithP = 0;
        for (String object : kitchenObjects){
            if (object.charAt(0) >= 65 && object.charAt(0) <= 90) countUppercase++;
            else if (object.charAt(0) >= 97 && object.charAt(0) <= 122)countLowercase++;
            if (object.toLowerCase().startsWith("p") || object.toLowerCase().endsWith("p")) countStartsWithorEndsWithP++;
            if (object.toLowerCase().contains("p")) countP++;

        }
        System.out.println("Elements starts with uppercase = " + countUppercase);
        System.out.println("Elements starts with lowercase = " + countLowercase);
        System.out.println("Elements having P or p = " + countP);
        System.out.println("Elements starting or ending with P or p = " + countStartsWithorEndsWithP);

        System.out.println("----TASK 10----");
        List<Integer> numbersT10 = new ArrayList<>();
        numbersT10.add(3);
        numbersT10.add(5);
        numbersT10.add(7);
        numbersT10.add(10);
        numbersT10.add(0);
        numbersT10.add(20);
        numbersT10.add(17);
        numbersT10.add(10);
        numbersT10.add(23);
        numbersT10.add(56);
        numbersT10.add(78);
        System.out.println(numbersT10);
        int countDivisibleBy10 = 0;
        int countEvenAndGreaterThan15 = 0;
        int countOddAndLessThan20 = 0;
        int countLessThan15OrGreaterThan50 = 0;
        for (Integer number : numbersT10){
            if (number % 10 == 0) countDivisibleBy10++;
            if (number % 2 == 0 && number > 15) countEvenAndGreaterThan15++;
            if (number % 2 != 0 && number < 20) countOddAndLessThan20++;
            if (number < 15 || number > 50) countLessThan15OrGreaterThan50++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDivisibleBy10);
        System.out.println("Elements that are even and greater than 15 = " + countEvenAndGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + countOddAndLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLessThan15OrGreaterThan50);
    }
}
