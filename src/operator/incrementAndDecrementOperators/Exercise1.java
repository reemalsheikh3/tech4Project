package operator.incrementAndDecrementOperators;

public class Exercise1 {
    public static void main(String[] args) {
        int i = 5;
        int age = 10 * (i++); // 50
        System.out.println(age);

        age = 10 * i; //10 * 6
        System.out.println(age);// 60

        age = 10 * ++i; //10 * 7
        System.out.println(age); //70

        age = 10 * i++; // 10 * 7
        System.out.println(age); //70

        age = 10 * i; //10 * 8
        System.out.println(age); //80



    }
}
