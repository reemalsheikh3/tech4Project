package learningObjects;

public class LearningConcatMethod {
    public static void main(String [] args){

        String tech = "Tech";
        String global = "Global";

        String schoolName1 = tech + global;
        String schoolName2 = tech.concat(global);

        System.out.println(schoolName1 + "\n" + schoolName2);

        String myName = "Reem";
        String myLastName = "Alsheikh";

        String fullName1 = "Reem Alsheikh";
        String fullName2 = myName + " " + myLastName;
        String fullName3 = myName.concat(" " + myLastName);
        String fullName4 = myName + " ".concat(myLastName);


        System.out.println(fullName3);


    }
}
