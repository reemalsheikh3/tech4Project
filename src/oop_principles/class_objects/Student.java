package oop_principles.class_objects;

public class Student {
    //Call default constructor
    public Student(){

    }

    //Define instance variables
    public String firstName;
    public String lastName;
    public int age;
    public String dateOfBirth;
    public String gender;
    public String address;
    public double height;
    public double weight;
    public String email;
    public int id;

    //Define Student behaviors - functions

    public void study(){
        System.out.println("Student studies");
    }
    public void eat(){
        System.out.println("Student eats");
    }
    public void sleep(){
        System.out.println("Student sleeps");
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
