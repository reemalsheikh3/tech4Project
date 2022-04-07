package projects;

public class Project03 {
    public static void main(String[] args){
        System.out.println("---TASK 1 ---");

        String s1 = "24", s2 = "5";
        int s1I = Integer.parseInt(s1), s2I = Integer.parseInt(s2);

        System.out.println("The sum of " + s1I + " and " + s2I + " = " + (s1I + s2I));
        System.out.println("The subtraction of " + s1I + " and " + s2I + " = " + (s1I - s2I));
        System.out.println("The division of " + s1I + " and " + s2I + " = " + ((double) s1I / s2I));
        System.out.println("The multiplication of " + s1I + " and " + s2I + " = " + (s1I * s2I));
        System.out.println("The remainder of " + s1I + " and " + s2I + " = " + (s1I % s2I));

        System.out.println("---TASK 2 ---");
        int t2_N1 = (int)(Math.random() * 35) + 1;

        if(t2_N1 % 2 == 1) System.out.println("THE NUMBER IS A PRIME NUMBER");
        else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");

        System.out.println("---TASK 3 ---");
        int t3_N1 = (int)(Math.random() * 50) + 1;
        int t3_N2 = (int)(Math.random() * 50) + 1;
        int t3_N3 = (int)(Math.random() * 50) + 1;

        int max = (Math.max(Math.max(t3_N1, t3_N2), t3_N3));
        int min = (Math.min(Math.min(t3_N1, t3_N2), t3_N3));
        int mid;

        System.out.println("Random number 1 = " + t3_N1);
        System.out.println("Random number 2 = " + t3_N2);
        System.out.println("Random number 3 = " + t3_N3);
        System.out.println("Lowest number is = " + min);

        if (t3_N1 != max && t3_N1 != min) {
            mid = t2_N1;
        }
        else if (t3_N2 != max && t3_N2 != min) {
            mid = t3_N2;
        }
        else mid = t3_N3;

        System.out.println("Middle number is = " + mid);
        System.out.println("Greatest number is = " + max);

        System.out.println("---TASK 4 ---");

        char c = '5';
        if (c >= 65 && c <= 90) System.out.println("The letter is uppercase");
        else if (c >= 97 && c <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        char c2 = 'a';
        if (c2 >= 65 && c2 <= 90) System.out.println("The letter is uppercase");
        else if (c2 >= 97 && c2 <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        char c3 = 'R';
        if (c3 >= 65 && c3 <= 90) System.out.println("The letter is uppercase");
        else if (c3 >= 97 && c3 <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");


        System.out.println("---TASK 5---");
        char t5_C1 = '#';
        if ((t5_C1 >= 65 && t5_C1 <= 90) || (t5_C1 >= 97 && t5_C1 <= 122)){
            if (t5_C1 == 'A' || t5_C1 == 'E' || t5_C1 == 'I' || t5_C1 == 'O' || t5_C1 == 'U' || t5_C1 == 'a'
                    || t5_C1 == 'e' || t5_C1 == 'i' || t5_C1 == 'o' || t5_C1 == 'u') {
                System.out.println("The letter is vowel");
            }
            else {
                System.out.println("The letter is a consonant");
            }
        }
        else {
            System.out.println("Invalid character detected!!!");
        }

        char t5_C2 = 'E';
        if ((t5_C2 >= 65 && t5_C2 <= 90) || (t5_C2 >= 97 && t5_C2 <= 122)){
            if (t5_C2 == 'A' || t5_C2 == 'E' || t5_C2 == 'I' || t5_C2 == 'O' || t5_C2 == 'U' || t5_C2 == 'a'
                    || t5_C2 == 'e' || t5_C2 == 'i' || t5_C2 == 'o' || t5_C2 == 'u') {
                System.out.println("The letter is vowel");
            }
            else {
                System.out.println("The letter is a consonant");
            }
        }
        else {
            System.out.println("Invalid character detected!!!");
        }

        char t5_C3 = 'R';
        if ((t5_C3 >= 65 && t5_C3 <= 90) || (t5_C3 >= 97 && t5_C3 <= 122)){
            if (t5_C3 == 'A' || t5_C3 == 'E' || t5_C3 == 'I' || t5_C3 == 'O' || t5_C3 == 'U' || t5_C3 == 'a'
                    || t5_C3 == 'e' || t5_C3 == 'i' || t5_C3 == 'o' || t5_C3 == 'u') {
                System.out.println("The letter is vowel");
            }
            else {
                System.out.println("The letter is a consonant");
            }
        }
        else {
            System.out.println("Invalid character detected!!!");
        }

        System.out.println("---TASK 6 ---");
        char t6_N1 = '8';
        if((t6_N1 >= 48 && t6_N1 <= 57) || (t6_N1 >= 65 && t6_N1<= 90) ||(t6_N1 >= 97 && t6_N1 <= 122)){
            System.out.println("Invalid character detected!!!");
        }else{
            System.out.println("Special character is = " + String.valueOf(t6_N1));
        }

        char t6_C1 = '*';
        if((t6_C1 >= 48 && t6_C1 <= 57) || (t6_C1 >= 65 && t6_C1 <= 90) || (t6_C1 >= 97 && t6_C1 <= 122)){
            System.out.println("Invalid character detected!!!");
        }else{
            System.out.println("Special character is = " + String.valueOf(t6_C1));
        }

        System.out.println("---TASK 7 ---");

        char t7_C1 = 'g';
        if ((t7_C1 >= 65 && t7_C1 <= 90) || (t7_C1 >= 97 && t7_C1 <= 122)) {
            System.out.println("Character is a letter");
        }else if(t7_C1 >= 48 && t7_C1 <= 57){
            System.out.println("Character is a digit");
        }else {
            System.out.println("Character is a special character");
        }

        char t7_C2 = '5';
        if ((t7_C2 >= 65 && t7_C2 <= 90) || (t7_C2 >= 97 && t7_C2 <= 122)) {
            System.out.println("Character is a letter");
        }else if(t7_C2 >= 48 && t7_C2 <= 57){
            System.out.println("Character is a digit");
        }else {
            System.out.println("Character is a special character");
        }

        char t7_C3 = '@';
        if ((t7_C3 >= 65 && t7_C3 <= 90) || (t7_C3 >= 97 && t7_C3 <= 122)) {
            System.out.println("Character is a letter");
        }else if(t7_C3 >= 48 && t7_C3 <= 57){
            System.out.println("Character is a digit");
        }else {
            System.out.println("Character is a special character");
        }




    }
}
