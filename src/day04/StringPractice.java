package day04;

public class StringPractice {

    public static void main(String[] args) {

        String firstname = "Sevim ";
        String lastname = "Zini";

        String fullname = firstname + lastname;

        ///  \t space birakir arada bosluk. asagidaki ornege bak.

        System.out.println("My first name is" + " " + firstname);
        System.out.println("My last name is " + lastname);

        System.out.println("My full name is " + fullname);

        // I saw fire HD8 hands-free with Alexa for
        //$79.99
        //extract data out of this sentence and store it into a variable.

        String productName = "Amazonfire";
        String    model = "HD";
        int version = 8;
        float price = 79.99f;

        System.out.println("I saw " + productName + " " + model + version + " hands- free with Alexa for " + "$" + price + "."   );


    }




}
