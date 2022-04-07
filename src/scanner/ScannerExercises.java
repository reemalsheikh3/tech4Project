package scanner;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class ScannerExercises {
    public static void main(String[] args){

        /*
        Pseudo Code:
        1. Create an object of scanner (import)
        2. Print out instructions about what we need
        3. Use next() method for reading

         */
        Scanner nameCollect = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = nameCollect.next();
        System.out.println("What is your last name?");
        String lastName = nameCollect.next();
        System.out.println("The user's full name is = " + "\"" + firstName + " " + lastName);

        /*
        Pseudo code:
        1. Create object of scanner
        2. Print out question for what information is needed
        3. Get the address and store it in use nextline() method
        4. Print out the user's address
         */

        Scanner collect = new Scanner(System.in);
        System.out.println("What is your full address?");
        String userAddress = collect.nextLine();
        System.out.println("The user's address is \"" + userAddress + "\"");

        /*
        1. Create object for scanner
        2. Ask question
        3.
         */

        System.out.println("Please enter a number below.");
        int number1 = collect.nextInt();
        System.out.println("Please enter another number");
        int number2 = collect.nextInt();
        System.out.println("Please enter last number");
        int number3 = collect.nextInt();

        System.out.println("Sum of the numbers is = " + (number1 + number2 + number3)); // 1 way or

        int sum = number1 + number2 + number3;
        System.out.println("Sum of the number is = "+ sum); // way 2



    }

}
