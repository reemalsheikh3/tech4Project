package operator.shortHandAssignmentOperators;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your balance = $");
        double balance = input.nextDouble();

        System.out.println("Please enter 1st transaction = $");
        double trans1 = input.nextDouble();
        balance -= trans1;
        System.out.println("Balance after 1st transaction = $" + balance);

        System.out.println("Please enter your 2nd transaction = $");
        double trans2 = input.nextDouble();
        balance -= trans2;
        System.out.println("Balance after your 2nd transaction = $" + balance);

        System.out.println("Please enter your 3rd transaction = $");
        double trans3 = input.nextDouble();
        balance -= trans3;
        System.out.println("Balance after your 3rd transaction = $" + balance);





    }
}
