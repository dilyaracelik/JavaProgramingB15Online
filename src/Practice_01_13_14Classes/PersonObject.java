package Practice_01_13_14Classes;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person ();

        Person person2 = new Person ();
        Person person3 = new Person ();

        person1.firstName = "Berk";
        person1.lastName = "Zini";
        person1.DOB = "12/31/2012";

        person1.printInfo();


    }
}
