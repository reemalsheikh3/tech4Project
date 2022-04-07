package myExtraPractice;

public class Mock2Practice {
    public static String swapFirstAndLastWordsInAString (String s){
        String first = s.substring(0, s.indexOf(' '));
        String middle = s.substring(s.indexOf(' ') + 1, s.lastIndexOf(' '));
        String last = s.substring(s.lastIndexOf(' ') + 1);
        return last + " " + middle + " " + first;
    }
}
