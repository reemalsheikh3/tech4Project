package casting;

public class AutoboxingAndUnboxing {
    public static void main(String[] args){

        //Autoboxing (primitive -> object[wrapper class])

        float num = 45.6F;
        // var num1 = 45.6F; --> in java 10 we dont need to specify data type
        Float numFloat = num;

        //Unboxing (object[wrapper class] -> primitive)
        Character character = 'D';
        char characterPrimitive = character;
        //BOTH AUTOBOXING AND UNBOXING ARE IMPLICIT
    }
}
