package loops.nestedLoops;

public class PrintAllLetters {
    public static void main(String[] args) {

        //SEPARATE LOOPS
        System.out.println("Lowercase Letters");
        for (int l = 97; l <= 122; l++){
            System.out.print((char)l + " ");
        }
        System.out.println("\nUppercase Letters");
        for (char l = 65; l <= 90; l++){
            System.out.print(l + " ");
        }

            //NESTED LOOP
        for (int i = 1; i <= 2; i++){
            int start = 97;
            if (i == 1){
                //First iteration start point = 97 end = 122
                System.out.println("Lowercase Letters");
            }
            else{
                //Second iteration start point = 65 end = 90
                System.out.println("Uppercase Letters");
                start = 65;
            }
            for (int j = start; j <= start+25; j++){
                System.out.println((char)j);
            }
        }
    }
}
