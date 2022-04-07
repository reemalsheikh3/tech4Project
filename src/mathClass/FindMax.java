package mathClass;

public class FindMax {
    public static void main(String[] args) {

        int x = 8;
        int y = 20;
        int z = 12345;
        int a = 34;
        int b = 123;

        int maxValueOfXY = Math.max(x,y); //char can be put as well --> ex: 'a' = 97 from ASCII table
        int maxValueOfXYZ = Math.max(maxValueOfXY, z);

        int maxValueOfAB = Math.max(a,b);
        int maxOfEvery = Math.max(maxValueOfXYZ , maxValueOfAB);


        System.out.println(maxValueOfXY);
        System.out.println(maxValueOfXYZ);
        System.out.println(maxValueOfAB);
        System.out.println(maxOfEvery);
    }
}
