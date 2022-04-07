package oop_principles.class_objects;

public class TestBlocks {
    //static blocks of Fruit will be executed
    public static void main(String[] args) {
        System.out.println("Hello this is line 1 in main method before object is created");
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit();
        Fruit fruit3 = new Fruit();
        Fruit fruit4 = new Fruit();
        System.out.println("This is last line in main method after object is created");
    }
}
