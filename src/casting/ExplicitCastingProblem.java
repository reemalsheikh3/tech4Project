package casting;

public class ExplicitCastingProblem {
    public static void main(String[] args) {

        int num = 150;
        byte b = (byte) num;

        System.out.println(b); //-106 ==> byte = -128 - 127.... so 128 = -128, 129 = -127, 130 = -126 ...-->>> 150 = -106
    }
}
