package utilities;

public class MathHelper {
    //Create a method that takes 3 ints and returns the max

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    public static double maxOfThree(double num1, double num2, double num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
    //create a method that takes a 3 byte numbers as arguments and returns the smallest

    public static byte minOfThree(byte num1, byte num2, byte num3) {
        return (byte) Math.min(Math.min(num1, num2), num3);
    }
    /*
    Please create method that takes an int as an argument and returns true it if is even
    returns false if it is odd

    return type
    isEven
    static
     */

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    //Create a method called isOdd() that takes one int parameter and returns true if
    // the number is odd, false otherwise

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    //Create a method that takes one int as an argument and returns if the number is positive.
    //If the number is positive , it will return true
    //Otherwise it will return false

    public static boolean isPositive(int number) {
        return number > 0;
    }

    //Create another method called isNegative

    public static boolean isNegative(int number) {
        return number < 0;
    }

    //Create another method called isZero

    public static boolean isZero(int number) {
        return number == 0;
    }
}

