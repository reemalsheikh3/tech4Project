package ifElseStatements.ifStatements;
import java.util.Scanner;
public class RetiredExample {
    public static void main(String[] args) {
        /*
        1. Create Scanner object
        2. Ask questions and retrieve age
        3. Use if statement and proper action in curly braces
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age.");
        int age = scanner.nextInt();

        if(age >= 55) {
            System.out.println("It is your time to retire!");
        } else{
            System.out.println("You are not going to retire!");
        }
    }
}
