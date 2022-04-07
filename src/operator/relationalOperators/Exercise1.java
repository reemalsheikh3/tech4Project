package operator.relationalOperators;

public class Exercise1 {
    public static void main(String[] args) {

        //Declare and assign variables
        int x = 10;
        int y = 20;
        int z = 10;

        boolean b1 = y == z; //false
        boolean b2 = x <= z; //true
        boolean b3 = x >= z; //true
        boolean b4 = y > x; //true
        boolean b5 = x >= y; //false
        //boolean b6 = ((x >= z) < y);

        System.out.println("Is this true or false? " + b1);



    }
}
