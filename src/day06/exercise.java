package day06;

import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your full name?:");
        String name = scan.nextLine();
        System.out.println("You have entered "+name);

        System.out.println("Which city you live in, including state?:");
        String cityAndState = scan.nextLine();
        System.out.println("You have entered "+ cityAndState);

        System.out.println(" What is your street address?:");
        String streetAddress = scan.nextLine();
        System.out.println("Your street address is "+ streetAddress);



    }
}
