package loops.forLoops;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        //1st way ** best way

        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0) System.out.println(i);
        }
        //2nd way
        for (int i = 0; i <= 10; i++) {
            if (MathHelper.isEven(i)) System.out.println(i);
        }

        //3rd way
        for (int i = 0; i <= 10; i+=2) { //be careful with start point
            System.out.println(i);
        }
    }
}
