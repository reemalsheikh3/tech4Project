package loops.forLoops;

public class CountCharacterInAString {
    public static void main(String[] args) {
        String str = "TechGlobal SCHOOL";
        int count = 0;
        for (int i = 0; i <= str.length()-1; i++){
          if (str.toLowerCase().charAt(i) == 'o') count++;
        }
        System.out.println(count);
    }
}
