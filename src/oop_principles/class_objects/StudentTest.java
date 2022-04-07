package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        /*
        Create a Student object with below info
         */
        Student student1 = new Student();
        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.dateOfBirth = "01/01/1977";
        student1.gender = "male";
        student1.address = "Chicago";
        student1.weight = 170.5;
        student1.height = 5.7;
        student1.email = "johndoe@gmail.com";
        student1.id = 1001;
        System.out.println(student1);

        Student student2 = new Student();
        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.dateOfBirth = "01/01/1988";
        student2.gender = "male";
        student2.address = "Paris";
        student2.weight = 150;
        student2.height = 4.9;
        student2.email = "lionel@gmail.com";
        student2.id = 1002;
        System.out.println(student2);

        Student student3 = new Student();
        student3.firstName = "Alex";
        student3.lastName = "Morgan";
        student3.age = 20;
        student3.dateOfBirth = "01/01/2002";
        student3.gender = "male";
        student3.address = "Chicago";
        student3.weight = 165;
        student3.height = 5.5;
        student3.email = "alex@gmail.com";
        student3.id = 1003;
        System.out.println(student3);

        Student student4 = new Student();
        student4.firstName = "Jessie";
        student4.lastName = "Smith";
        student4.age = 15;
        student4.dateOfBirth = "01/01/2007";
        student4.gender = "female";
        student4.address = "Miami";
        student4.weight = 160;
        student4.height = 5.7;
        student4.email = "jessie@gmail.com";
        student4.id = 1004;
        System.out.println(student4);

        Student student5 = new Student();
        student5.firstName = "Kaly";
        student5.lastName = "Ngo";
        student5.age = 16;
        student5.dateOfBirth = "01/01/2006";
        student5.gender= "female";
        student5.address = "Berlin";
        student5.weight = 150;
        student5. height = 5.3;
        student5.email = "kaly@gmail.com";
        student5.id = 1005;
        System.out.println(student5);

        List<Student> classStudents = new ArrayList<>();
        classStudents.add(student1);
        classStudents.add(student2);
        classStudents.add(student3);
        classStudents.add(student4);
        classStudents.add(student5);
        int count = 0;
        int countMale = 0;
        int countFemale = 0;

        for (Student s : classStudents){
            if (s.address.equalsIgnoreCase("Chicago")) count++;
            if (s.gender.equalsIgnoreCase("male")) countMale++;
            else countFemale++;
        }
        System.out.println(count);
        System.out.println("Male = " + countMale);
        System.out.println("Female = " + countFemale);

        int countTeens = 0;
        for (Student s : classStudents){
            if (s.age > 12 && s.age < 20) countTeens++;
        }
        System.out.println("Teens = " + countTeens);

        /*
        Task-4 print info of each student in seperate lines
         */
        /*
        for (Student s :classStudents){
            System.out.println(s.firstName);
            System.out.println(s.lastName);
            System.out.println(s.age);
            System.out.println(s.dateOfBirth);
            System.out.println(s.gender);
            System.out.println(s.address);
            System.out.println(s.weight);
            System.out.println(s.height);
            System.out.println(s.email);
            System.out.println(s.id);
            System.out.println();
        }

        */

        classStudents.forEach(s -> {
            System.out.println(s.firstName);
            System.out.println(s.lastName);
            System.out.println(s.age);
            System.out.println(s.dateOfBirth);
            System.out.println(s.gender);
            System.out.println(s.address);
            System.out.println(s.weight);
            System.out.println(s.height);
            System.out.println(s.email);
            System.out.println(s.id);
            s.sleep();
            s.study();
            s.eat();
            System.out.println();
        });
    }
}
