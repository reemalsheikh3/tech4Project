package ifElseStatements;

public class FindTheGreatestOf2Numbers {
    public static void main(String[] args){
        int num1 = (int)(Math.random() * 11), num2 = (int)(Math.random() * 11);
        System.out.println(num1);
        System.out.println(num2);

       // System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + Math.max(num1, num2));
        //find max without Math.max()
        if(num1 > num2){
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num1);
        }else{
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num2);
        }


        //short cut if else statement
        if(num1 > num2) System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num1);
        else System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num2);

    }
}
