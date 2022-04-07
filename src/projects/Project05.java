package projects;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {
        System.out.println("---TASK 1---");

        String s1 = ScannerHelper.getAStringFromUser();
        if (s1.length() >= 8) {
            String first = s1.substring(0, 4);
            String middle = s1.substring(4, s1.length()-4);
            String last = s1.substring(s1.length() - 4);

            System.out.println(last + middle + first);
        }else{
            System.out.println("This String does not have 8 characters");
        }

        System.out.println("---TASK 2---");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String s2 = input.nextLine();

        if (s2.trim().contains(" ")) {
            String firstS2 = s2.substring(0, s2.indexOf(' '));
            String lastS2 = s2.substring(s2.lastIndexOf(' ')+1);
            String middleS2 = s2.substring(s2.indexOf(' '), s2.lastIndexOf(' ')+1);
            System.out.println(lastS2 + middleS2 + firstS2);
        }
        else {
            System.out.println("This sentence does not have 2 or more words to swap");
        }

        System.out.println("---TASK 3---");

        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        if (sentence.contains("stupid") || sentence.toLowerCase().contains("idiot")){
            System.out.println(sentence.replace("stupid", "nice").replace("idiot", "nice"));
        }
        System.out.println("---TASK 4---");

        System.out.println("Please enter your name");
        String name = input.nextLine();

        if (name.length() <= 2) System.out.println("Invalid input!!!");
        else if (name.length() % 2 == 0) System.out.println("" + (name.charAt(name.length()/2-1)) + (name.charAt(name.length() /2)));
        else System.out.println(name.charAt(name.length() / 2));

        System.out.println("---TASK 5---");
        System.out.println("Please enter a country");
        String country = input.nextLine();
        if (country.length() > 5) {
            System.out.println(country.replace(country.substring(0, 2), "")
                    .replace(country.substring(country.length()-2), ""));
        }
        else System.out.println("Invalid input!!!");

        System.out.println("---TASK 6---");
        System.out.println("Please enter your full address");
        String address = input.nextLine();

        if (address.toLowerCase().contains("a") || address.toLowerCase().contains("e") || address.toLowerCase().contains("i")
        || address.toLowerCase().contains("u") || address.toLowerCase().contains("o")){

            System.out.println(address.replace('a', '*').replace('e', '#')
                    .replace('i', '+').replace('u', '$').replace('o', '@'));

        }else System.out.println(address);

        System.out.println("---TASK 7---");

        int n1 = (int) (Math.random() * 26), n2 = (int) (Math.random() * 26);
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        String t_7 = "";
        for (int i = min; i <= max; i++){
            if (i % 5 != 0) t_7 += (i + " - ");
        }
        System.out.println(t_7);
    }
}
