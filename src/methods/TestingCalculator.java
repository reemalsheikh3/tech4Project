package methods;

import utilities.Calculator;
import utilities.CharacterHelper;

public class TestingCalculator {
    public static void main(String[] args){
        int i1 = 15, i2 = 2;

       int result = Calculator.divide(i1, i2); //returns an int
        System.out.println(result); //7

        double d1 = 15, d2 = 2;
        double results2 = Calculator.divide(d1, d2); // returns double
        System.out.println(results2);

        int max = Math.max(1, 2);

        double max2 = Math.max(15.2, 10);

        System.out.println(Math.max(15.2, 10)); //this method is return type
        System.out.println(Calculator.divide(d1, d2)); // this method is also return type

    }
}
