package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        int num = 36;

        // + (concatenation)
        // valueOf() method

        String numStr = 45 + num + ""; // ("" + 45 + num = 4536) ;; (45 + num + "" = 81)
        String numStr2 = String.valueOf(num + 45);

        System.out.println("numStr " + numStr);
        System.out.println("numStr2 " + numStr2);
    }
}
