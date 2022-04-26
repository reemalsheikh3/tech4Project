package recursion;

public class _03_ReverseString {
    public static String reverseString(String str){
        if (str.length() <= 1) return str;
        return reverseString(str.substring(1)) + str.charAt(0); //reverse("pple") + a;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Apple")); //elppA
    }
}
