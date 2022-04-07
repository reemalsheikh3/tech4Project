package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("---TASK 1---");
        int[] numT1 = new int[10];
        numT1[2] = 23;
        numT1[4] = 12;
        numT1[7] = 34;
        numT1[9] = 7;
        numT1[6] = 15;
        numT1[0] = 89;
        System.out.println(numT1[3]);
        System.out.println(numT1[0]);
        System.out.println(numT1[9]);
        System.out.println(Arrays.toString(numT1));

        System.out.println("---TASK 2---");
        String[] sT2 = new String[5];
        sT2[1] = "abc";
        sT2[4] = "xyz";
        System.out.println(sT2[3]);
        System.out.println(sT2[0]);
        System.out.println(sT2[4]);
        System.out.println(Arrays.toString(sT2));

        System.out.println("---TASK 3---");
        int[] numT3 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numT3));
        Arrays.sort(numT3);
        System.out.println(Arrays.toString(numT3));

        System.out.println("---TASK 4---");
        String[] countriesT4 = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countriesT4));
        Arrays.sort(countriesT4);
        System.out.println(Arrays.toString(countriesT4));

        System.out.println("---TASK 5---");
        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));
        boolean pluto = false;
        for (int i = 0; i <= cartoonDogs.length-1 ; i++) {
            if (cartoonDogs[i].equals("Pluto")) {
                pluto = true;
                break;
            }
        }
        System.out.println(pluto);

        System.out.println("---TASK 6---");

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        boolean cats = false;
        for (int i = 0; i <= cartoonCats.length-1 ; i++) {
            if (cartoonCats[i].equals("Garfield") && cartoonCats[i].equals("Felix")) {
                cats = true;
                break;
            }
        }
        System.out.println(cats);

        System.out.println("---TASK 7---");
        double[] numT7 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numT7));
        for (int i = 0; i < numT7.length; i++) {
            System.out.println(numT7[i]);
        }

        System.out.println("---TASK 8---");
        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(chars));
        int countLetters = 0;
        int countUppercase = 0;
        int countLowercase = 0;
        int countDigit = 0;
        int countSpecial = 0;
        for (char characters : chars){
            if (Character.isLetter(characters)) {
                countLetters++;
                if (Character.isUpperCase(characters)) countUppercase++;
                else countLowercase++;
            }
            else if (Character.isDigit(characters)) countDigit++;
            else countSpecial++;
        }
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUppercase);
        System.out.println("Lowercase letters = " + countLowercase);
        System.out.println("Digits = " + countDigit);
        System.out.println("Special character = " + countSpecial);

        System.out.println("---TASK 9---");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        countUppercase = 0;
        countLowercase = 0;
        int countBorP = 0;
        int countBookPen = 0;
        System.out.println(Arrays.toString(objects));
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].charAt(0) >= 65 && objects[i].charAt(0) <= 90) {
                countUppercase++;
                if (objects[i].charAt(0) == 66 || objects[i].charAt(0) == 80) countBorP++;
            }
            else if (objects[i].charAt(0) >= 97 && objects[i].charAt(0) <= 122) {
                countLowercase++;
                if (objects[i].charAt(0) == 98 || objects[i].charAt(0) == 112) countBorP++;
            }
            if (objects[i].toUpperCase().contains("BOOK") || objects[i].toUpperCase().contains("PEN")) countBookPen++;
        }
        System.out.println("Elements start with uppercase = " + countUppercase);
        System.out.println("Elements start with lowercase = " + countLowercase);
        System.out.println("Elements start with B or P = " + countBorP);
        System.out.println("Elements having \"book\" or \"pen\" = " + countBookPen);

        System.out.println("---TASK 10---");
        int[] numbersT10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int countGreaterThan10 = 0;
        int countLessThan10 = 0;
        int countEqual10 = 0;
        System.out.println(Arrays.toString(numbersT10));
        for (int digits : numbersT10){
            if (digits > 10) countGreaterThan10++;
            else if (digits < 10) countLessThan10++;
            else countEqual10++;
        }
        System.out.println("Elements that are more than 10 = " + countGreaterThan10);
        System.out.println("Elements that are less than 10 = " + countLessThan10);
        System.out.println("Elements that are 10 = " + countEqual10);

        System.out.println("---TASK 11---");
        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[5];
        int max = 0;
        System.out.println("1st array is = " + Arrays.toString(first));
        System.out.println("2nd array is = " + Arrays.toString(second));
        for (int i = 0; i < first.length; i++) {
            max = Math.max(first[i], second[i]);
            third[i] += max;
        }
        System.out.println("3rd array is = " + Arrays.toString(third));



    }
}

