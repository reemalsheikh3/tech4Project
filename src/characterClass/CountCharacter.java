package characterClass;

import utilities.CharacterHelper;

public class CountCharacter {
    public static void main(String[] args) {
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count = 0;
        for (int i = 0; i <= address.length() - 1; i++) {
            // if (address.charAt(i) == ' ') {
            if (Character.isSpaceChar(address.charAt(i))){
                count++;
        }
        }
        System.out.println(count);

        int count2 = 0;
        for (int i = 0; i <= address.length()-1; i++){
            if (Character.isLetter(address.charAt(i))) {
                count2++;
                //  char c = address.charAt(i);
                //  if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) count2++;
            }
        }
        System.out.println(count2);
        int countLowercase = 0;
        int countUppercase = 0;
         for (int i = 0; i <= address.length()-1; i++){
             if (Character.isLowerCase(address.charAt(i))){
                 countLowercase++;
             }
             else if (Character.isUpperCase(address.charAt(i))){
                 countUppercase++;
             }
         }
        System.out.println(Math.abs(countLowercase - countUppercase));
        //2nd way
        int count3 = 0;
        for (int i = 0; i <=address.length()-1 ; i++) {

        }
        //3rd way
        count = 0;
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                if (Character.isUpperCase(c)) count++;
                else count--;
            }

        }
        int countVowels = 0;
        int countConsonant = 0;
        for (int i = 0; i <= address.length()-1 ; i++) {
            if (CharacterHelper.isConsonant(address.charAt(i))) {
                countConsonant++;
            }
                else if (CharacterHelper.isVowel(address.charAt(i))) {
                countVowels++;

            }

        }
        System.out.println("Vowels = " + countVowels);
        System.out.println("Consonants = " + countConsonant);

        int countLetter = 0;
        countUppercase = 0;
        countVowels = 0;
        int countDigit = 0;
        int countSpace = 0;
        int countSpecial = 0;
        countConsonant = 0;
        countLowercase = 0;
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i <= address.length()-1 ; i++) {
            char c = address.charAt(i);
            if(Character.isLetter(c)){
                countLetter++;
                if (Character.isUpperCase(c))
                    countUppercase++;
                else countLowercase++;
                if (CharacterHelper.isVowel(c)) countVowels++;
                else countConsonant++;
            }
           else if (Character.isDigit(c)) {
               countDigit++;
               if (Integer.parseInt(" " + c) % 2 == 0) countEven++;
               else countOdd++;
            }

           else if (Character.isWhitespace(c)) countSpace++;
           else countSpecial++;

        }
        System.out.println("Letters = " + countLetter);
        System.out.println("Lowercase = " + countLowercase);
        System.out.println("Uppercase = " + countUppercase);
        System.out.println("Vowels = " + countVowels);
        System.out.println("Consonant = " + countConsonant);
        System.out.println("Digit = " + countDigit);
        System.out.println("Spaces = " + countSpace);
        System.out.println("Specials = " + countSpecial);
    }
}
