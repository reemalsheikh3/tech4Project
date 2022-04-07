package mathClass;

public class FindRandom {
    public static void main(String[] args){

        double random = Math.random();

        int random0And10Included = (int) (Math.random() * 11); // 0 - 10

        System.out.println(random);
        System.out.println(random0And10Included);

        int random0And20Included = (int) (Math.random() * 21);
        System.out.println(random0And20Included);

        int random10and20included = (int) (Math.random() * 11) + 10;
        System.out.println(random10and20included);

        //create a random number between 103 - 346 included take that as an int
        //get the difference ---> 346-103=243 add +1
        //multiply it by 243 + 1 = 244
        //add the starting point to the equation
        //random * (end point - start point + 1) + start point --> included

        int random103And346Included = (int) (Math.random() * 244) + 103;
        System.out.println(random103And346Included);

        int random_50And50Included = (int) (Math.random() * 101) + -50;
        System.out.println(random_50And50Included);
    }
}
