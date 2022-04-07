package utilities;

public class Calculator {

    /*
    What do we need to create a method
    1. A proper name
    2. Decide its accessibility level (public)
    3. Decide its accessibility way (You want to call it with (class name ex: Math) or (object name ex: Scanner))
        static-> you want to call it with class name
        non-static -> you want to call it with an object
    4. Decide if it returns something or not
        if it returns -> then decide what it returns
        if it does not return -> then put void
    5. Does it take any arguments
        if it takes, decide what arguments it takes and how many arguments it takes

        NOTE: if your method is not void meaning it is returning something you MUST use return keyword in the body
        of the method
        NOTE: if your method returns an int, then the variable used next to return keyword in the body MUST be an int
        NOTE: Every method must have a body that runs a task
        NOTE: We can have multiple methods sharing the same name in the same class only if they have different arguments.
        Different arguments could be either the number of arguments are different or the types of arguments are different

        NOTE: DO NOT TRY TO PUT A METHOD INSIDE ANOTHER METHOD IT WILL NOT WORK
     */

    public static int divide(int num1, int num2) {
        return num1 / num2;

    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    //create a method that find the sum of 2 int numbers and returns it
    //create a method that find the sum of 2 double numbers and returns it
    //create a method that find the absolute difference of 2 int numbers and returns it
    //create a method that find the absolute difference of 2 double numbers and returns it
    //create a method that finds the product of 2 int numbers and returns it
    //create a method that finds the product of 2 double numbers and returns it

    public static int sum(int num1, int num2) {
        return (num1 + num2);
    }

    public static double sum(double num1, double num2) {
        return (num1 + num2);
    }

    public static int absoluteDifference(int num1, int num2) {
        return (Math.abs(num1 - num2));
    }

    public static double absoluteDifference(double num1, double num2) {
        return (Math.abs(num1 - num2));
    }

    public static int product(int num1, int num2){
        return (num1 * num2);
    }

    public static double product(double num1, double num2){
        return (num1 * num2);
    }
}