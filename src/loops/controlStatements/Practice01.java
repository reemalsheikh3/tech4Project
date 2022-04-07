package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        1. Create Scanner and ask for 2 integers
        2. create for loop with initial number being max and termination being min between both integers
        3. print numbers side by side
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 different integers");
        int n1 = input.nextInt(), n2 = input.nextInt();
        for (int i = (Math.max(n1, n2)); i >= Math.min(n1, n2); i--){
            if (i < 10) break;
            System.out.print(i + " ");
        }
    }
}
