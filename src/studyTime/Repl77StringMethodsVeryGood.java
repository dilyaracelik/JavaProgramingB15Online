package studyTime;

import java.util.Scanner;

public class Repl77StringMethodsVeryGood {
    public static void main(String[] args) {


//        Write a program that will print out information about
//        user based on email. Print first and last name from the upper case.

//        Example:
//        Input: craig_federighi@apple.com
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//        Top-Level Domain: com
     //   name.substring(name.indexOf(" ") + 1).toUpperCase();
        //

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName=email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));


        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));

        String topDomain=email.substring(email.indexOf(".")+1);

        System.out.println("First name: "+firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("Last name: "+lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+ topDomain);



    }


    }






