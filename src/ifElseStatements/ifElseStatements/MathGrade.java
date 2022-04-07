package ifElseStatements.ifElseStatements;
import java.util.Scanner;
public class MathGrade {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = in.nextLine();

        System.out.println("Hey " + fullName +  "! Please enter your balance?");
        double balance = in.nextDouble(); //Double.parseDouble(in.next());

        if(balance >= 600){
            System.out.println("Awesome! You have money");
        } else {
            System.out.println("Awww, sorry you are poor.");
        }
    }
}
