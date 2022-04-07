package ifElseStatements.ifStatements;
import java.util.Scanner;
public class MathGradeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hey David! Please enter your math grade?");
        int grade = input.nextInt();

        if(grade >= 60){
            System.out.println("Awesome! You have passed the math class!");
        } else{
            System.out.println("Go back to school!");
        }
    }
}

