package mathClass;

public class FindMin {
    public static void main(String[] args) {

        int x = 45;
        int y = 12;
        int z = 65;

        int a = 123;
        int b = -123;

        int minOfXY = Math.min(x , y); // 45,12
        int minOfZA = Math.min(z, a); // 65,123

        int minOfZAB = Math.min(minOfZA, b); //65,-123
        int minOfEverything = Math.min(minOfZAB , minOfXY);

        System.out.println(minOfEverything);

    }
}
