package homeworks;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        //TASK-1
        String str = "SDLC is step by step procedure to create an application";
        System.out.println("Length = " + str.length());
        System.out.println("Indexes of SDLC = " + str.indexOf("SDLC"));
        System.out.println("Indexes of application  = " + str.indexOf("application"));

        //TASK-2
        String str2 = "   I know how to code with python   ";
        System.out.println(str2.trim().toUpperCase().replace("PYTHON", "JAVA"));

        //TASK-3
        String str3 = "   SDLC has planning, design, development, testing, deployment and maintenance phases   " .trim();
        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(str3.length()-1));

        //TASK-4
        String s1 = "   TECH".trim();
        String s2 = "glo ".trim();
        String s3 = "BAL   ".trim();

        System.out.println(s1.toLowerCase().replace('t', 'T')+ s2.replace('g', 'G') + s3.toLowerCase());

        //TASK-5
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite color");
        String color = input.nextLine();

        System.out.println("1st character is = " + color.charAt(0));
        System.out.println("Last character is = " + color.charAt(color.length()-1));
        System.out.println("First 3 characters are = " + color.substring(0,3));
        System.out.println("Last 3 characters are = " + color.substring(color.length()-3));

        //TASK-6
        System.out.println("Please enter a full sentence");
        String sentence = input.nextLine().toLowerCase();
        System.out.println("1st word is = " + sentence.substring(0, sentence.indexOf(' ')));
        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(' ') + 1));

        //TASK-7
        System.out.println("Please enter a full sentence");
        String sentence2 = input.nextLine();

        if (sentence2.contains("$")) {
            System.out.println("This sentence contains $ character \n$ character's index is = " + sentence2.indexOf('$'));
        }else{
            System.out.println("This sentence does not contain $ character");
        }
    }
}
