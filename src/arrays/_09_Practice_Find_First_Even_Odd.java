package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {
        int [] numbers = {0, 5, 3, 2, 4, 7, 10};
        /*
        First even = 0
         */
        boolean isDigitEven = false;
        boolean isFirstOdd = false;
        int firstEven = 1;
        int countEven = 0;
        int countOdd = 0;

        for (int digit : numbers){
            if (digit % 2 == 0 && countEven == 0){
                isDigitEven = true;
                firstEven = digit;
                System.out.println("First even = " + digit);
                countEven++;
            }
            else if (countOdd == 0){
                isFirstOdd = true;
                System.out.println("First odd = " + digit);
                countOdd++;
            }
            if (isFirstOdd && isDigitEven) break;
        }
        if (!isDigitEven) System.out.println("There is no even number");
    }
}
