package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Before method: " + str);
        //str = str.replaceAll("[aeiouAEIOU]", "\\$");replace vowels with dollar sign
        str = str.replaceAll("[aeiouAEIOU]", "");//replace vowels
        System.out.println("After method: " + str);

        String str2 = "hello123world";
        str2 = str2.replaceAll("[0-9]", ""); //replace the digits
       // str2 = str2.replaceAll("[^0-9]", ""); replace everything but the digits
        System.out.println(str2);

        String str3 = " abc 123 $#^ ";
        str3 = str3.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str3);
    }
}
