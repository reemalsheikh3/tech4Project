package mathClass;
public class ExerciseMathRandom {
    public static void main(String[] args){

        //Create a program generating a random number between 45-98.
        //System.out.println((int)(Math.random() * 54 + 45));

        //
        int number1 = (int) (Math.random() * 19 + 67);
        int number2 = (int) (Math.random() * 19 + 67);
        System.out.println("First random number is = " + number1 + "\nSecond number is = " + number2 +
                "\nMax of two numbers is = " + Math.max(number1,number2) + "\nMin of two numbers is = " +
                Math.min(number1,number2));


    }
}
