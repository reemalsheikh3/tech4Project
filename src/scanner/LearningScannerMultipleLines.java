package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){

        //DataType variableName = data/value; --> Creating a variable
        //DataType/ClassName variable name =  new DataType/ClassName (if it is needed);
        //creating an object
        Scanner inputReader = new Scanner (System.in);

        System.out.println("Where is your address?");
        String userAddress = "\"" + inputReader.nextLine() + "\""; //objectName.methodName();

        System.out.println("User address is = " .concat(userAddress));

        System.out.println( "Whats your address");
        String myAddress = inputReader.next();
        System.out.println("My address is = " + myAddress);




    }
}
