package learningObjects;

public class LearningStrings {
    public static void main(String[] args) {
        //declare
        //assign

        String greetings;       // declaration
          greetings = "Hello"; // assignment

        //declare and assign
        //create a String variable and assign "Hello"

        String myGreetings = "Hello";

 //       System.out.println(greetings + " " + myGreetings);

        String myName = "Reem";
        String myLastName = "Alsheikh";
        String myFullName = "Reem" + "Alsheikh";
        String myFullName2 = myName.concat(myLastName);

         System.out.println(myFullName2);
         System.out.println(myFullName);

    }
}
