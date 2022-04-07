package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String name1 = "Taylor";
       // char first = name1.charAt(0);
      //  char last = name1.charAt(name1.length() - 1);
      //  String middle = "" + name1.charAt(name1.length()/2-1) + name1.charAt(name1.length()/2); // yl b/c even

      //  System.out.println(middle);

        String name2 = "Alona";
      //  char first2 = name2.charAt(0);
     //   char last2 = name2.charAt(name2.length() - 1);
      //  char middle2 = name2.charAt(name2.length()/2);

      //  System.out.println(middle2);

        //2nd way with methods!

        System.out.println(StringHelper.getMiddle(name1));
        System.out.println(StringHelper.getMiddle(name2));
        System.out.println(StringHelper.getMiddle("Reem"));
        System.out.println(StringHelper.getMiddle("Uthman"));


    }
}
