package loops.nestedLoops;

public class Practice01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            System.out.println(i);
            for (int n = 5; n >= 3; n--){
                System.out.println("\t" + n);
            }
        }

    }
}
