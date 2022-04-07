package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {
       //Write a program that writes "Hello" 30 times
        /*
        SYNTAX:
        for(start; termination; update){
            //Block of code to execute
        }
         */
        for (int count = 1; count <= 30; count++){ //post-increment -> increases in the next one not right away
            System.out.println("Hello");
        }
        for (int count = 10; count >= 1; count--){ //post-increment -> decreases in the next one not right away
            System.out.println("Hello World!");
        }
        int year = 2022;
        for (int i = 10; i <= 35; i++){
            System.out.println("Age is = " + i + " in " + year);
            year++;

        }


    }
}
