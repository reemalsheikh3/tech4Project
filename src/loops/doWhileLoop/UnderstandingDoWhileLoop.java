package loops.doWhileLoop;

import java.util.Random;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {
        Random random = new Random();
        boolean b = random.nextBoolean(); //true or false

        //true
        while(b){
            System.out.println("It is true");
            b = random.nextBoolean();
        }
        System.out.println("End of the program");

        do{
            System.out.println("true");
        }while (b); //true or false?

    }
}
