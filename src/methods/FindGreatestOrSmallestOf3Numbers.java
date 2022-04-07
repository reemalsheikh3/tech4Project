package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {

      //  System.out.println(Math.max(5, 1));
      int max = MathHelper.maxOfThree(5, 1, 5);

        System.out.println("Max of three numbers = " + max);

        MathHelper.maxOfThree(2.2, 2.3, 2.4);

        byte b1 = (byte)(Math.random()*10);
        byte b2 = (byte)(Math.random()*10);
        byte b3 = (byte)(Math.random()*10);

        System.out.println("Random 1 = " + b1);
        System.out.println("Random 2 = " + b2);
        System.out.println("Random 3= " + b3);

        System.out.println(MathHelper.minOfThree(b1, b2, b3));

    }
}
