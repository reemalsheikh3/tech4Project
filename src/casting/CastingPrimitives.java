package casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        /*
        double > float > long > int >= char >= short > byte
        char is unsigned, short is signed.
        So while they are both 2-byte
         */

        //implicit casting
        int myInt = 32;
        long myLong = myInt;

        //explicit casting
        myInt = (int) myLong;

        //implicit casting
        int mySecondInt = 'B';
        char myChar = 56; // do not have to cast because equal
        char mySecondChar = 56;

        int myThirdInt = (int) 45.4; // say the data type you want to convert not the other one!!

        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;
        //CHAR CAN NOT HOLD NEGATIVE VALUES

        byte num1 = 45;
        int num2 = num1; //smaller to bigger does not need ()--> implicit

        double num3 = 13.6;
        float num4 = (float) num3; //explicit -- going from bigger data type to smaller data type NEED ()

        int num5 = 45;
        short num6 = 34;

        char c = (char) num5; // have to cast for both because char can only be POSITIVE!!
        c = (char) num6;


    }
}
