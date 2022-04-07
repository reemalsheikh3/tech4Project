package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 101) -50;
        System.out.println(n);

        //if they CANNOT be present at the SAME time use if elses (use if elseif else)

        if (n > 0) {
            System.out.println("Win 10 points!");
            if (n > 25) {
                System.out.println("Win 10 points!");
            } else if (n == 7){
                System.out.println("Win GOLDEN 100 POINTS!");
            }

            }else if (n < 0){
            //negative
            if (n < -25){

            }else if(n == -7){
                System.out.println("Win 10 points!");
            }else{
                //zero
            }
        }
    }
}
