package day07;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
 //String  firstName, lastName, company, eMail; boyle de yazabiliriz
        //String firstName = "Sevim";
        //String lastName = "Zini";
        //String company = "Apple";
        //String eMail = "sevim_zini@apple.com";
        //System.out.println("My name is " + firstName + " " + lastName + " and I work for " +  company + " and my email is " + eMail + ".");

//string de olur asagidaki gibi

        System.out.println("Enter your first name , last name , company seperated by space: ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        String company = scanner.next();
        String eMail = "sevim_zini@apple.com";
        System.out.println("My name is " + firstName + " " + lastName + " and I work for " +  company + " and my email is " + eMail + ".");



    }
}
