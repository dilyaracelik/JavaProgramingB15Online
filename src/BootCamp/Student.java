package BootCamp;

public class Student {

    String name;
    String lastName;
    int age;
    char grade;
    String email;
    char gender;
    static String schoolName = "Timber Creek";


    public static void study() {


        System.out.println("Student studies courses");


    }


    void playGame() {

        System.out.println("Students play games after the courses");

    }


    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Mike";
        s1.lastName = "Brown";
        s1.age = 15;
        s1.gender = 'M';
        s1.email = "mikebrown@student.com";


        Student s2 = new Student();

        s1.name = "Jane";
        s1.lastName = "Eyre";
        s1.age = 13;
        s1.gender = 'F';
        s1.email = "janeeyre@student.com";


        System.out.println(s1.name + " " + s1.lastName);

        study();


    }


}
