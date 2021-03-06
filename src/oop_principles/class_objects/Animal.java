package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    //default constructor
    public Animal(){

    }


    //Custom constructor that takes 6 arguments - name, color, age, isHerbivore, isCarnivore, isOmnivore

    public Animal(String name, String color, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore){
        //I should assign these local variables into instance variables
        this.color = color;
        this.age = age;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
        this.isOmnivore = isOmnivore;
        this.name = name;
    }

    //Creating another 2 - args custom constructor
    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    //Fields of an Animal instance
    public static int noOfAnimals = 0;
    public static final boolean hasEyes = true;
    public String name;
    public String color;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;


    @Override
    public String toString() {
        String s = "Animal{";
        if(this.name != null) s +=   "name='" + this.name + '\'';
        if(this.color != null) s += ", color='" + this.color + '\'';
        if(this.age != 0) s +=  ", age=" + this.age;
        if(this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
        if(this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
        if(this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
        s += '}';
        return s;
    }




    //Testing Animal
    public static void main(String[] args) {

        /*
        Create an animal object called a1 and define its information as below
        Cow
        3
        Black
        Herbivore
         */

        Animal a1 = new Animal("Cow", "Black", 3, false, true, false);

        System.out.println(a1);

        /*
        Create a2 object with below info
        Cat
        1
        Gray
        Omnivore

        Print it as well
         */

        Animal a2 = new Animal("Cat", "Gray", 1, false, false, true);
        System.out.println(a2);

        Animal a3 = new Animal("Parrot", "White", 2, false, true, false);
        System.out.println(a3);

        Animal a4 = new Animal("Lion", "Beige", 4, true, false, false);
        System.out.println(a4);

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        /*
        int countOmnivore = 0;
        int countHerbivore = 0;
        int countCarnivore = 0;

        for (Animal animal : animals){
            if (animal.isOmnivore) countOmnivore++;
            else if (animal.isHerbivore) countHerbivore++;
            else  countCarnivore++;
        }

         */

        int countHerbivore = (int) animals.stream().filter(animal -> animal.isHerbivore).count();
        int countCarnivore= (int) animals.stream().filter(animal -> animal.isCarnivore).count();
        int countOmnivore = (int) animals.stream().filter(animal -> animal.isOmnivore).count();

        System.out.println("Omnivore = " + countOmnivore);
        System.out.println("Herbivore = " + countHerbivore);
        System.out.println("Carnivore = " + countCarnivore);
    }
}



