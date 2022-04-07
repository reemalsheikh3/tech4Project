package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = -1;

        //you can use relational (>=, !=, ==..) and logical (&&, ||) operators
        //expression which is going to be true if balance is less than 0
        boolean isBalanceLessThan0 = balance < 0; //false
        boolean isBalanceEqual100 = balance == 0; //false
        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000; //false
        boolean isBalanceNotEqual_1 = balance != -1; //true

        if(isBalanceLessThan0){ // if this is true execute otherwise skip
            System.out.println("Your balance is under 0");
        }
    }
}
