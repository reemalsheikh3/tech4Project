package ifElseStatements.ifStatements;
import java.util.Scanner;
public class EvenExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number?");
        int n1 = in.nextInt();

        if(n1 % 2 == 0){
            System.out.println("The number you entered is even!");
        } else{
            System.out.println("Your number is odd!");
        }
    }
}
