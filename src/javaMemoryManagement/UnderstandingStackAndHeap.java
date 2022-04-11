package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {
        int age = 45;
        System.out.println(age);

        //reference - object
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog1); //Dog@1540e19d
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
