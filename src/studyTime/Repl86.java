package studyTime;

import java.util.Scanner;

public class Repl86 {
    public static void main(String[] args) {

//        Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
//        Ask for the first guest name.
//        Then ask does user want to enter one more guest.
//        If yes - take input from.
//        If not - finish the program and print list of the guests.
//
//        Example of the program:
//
//        Please enter guest name:
//        Nick
//        Do you want to enter new guest name:
//        yes
//        Please enter guest name:
//        Linda
//        Do you want to enter new guest name:
//        no
//
//        Guest's list: Nick, Linda

        Scanner input = new Scanner(System.in);
String guestName = "";
        System.out.println ("Please enter guest name:");
        String guestName1 = input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String guestWant = input.next();
        String otherGuest= "";
        if(guestWant.equals("no")){
            System.out.println("Guest list: "+guestName);
        }else if(guestWant.equals("yes")){
            while (guestWant.equals("yes")) {
                System.out.println("Please enter guest name:");
                otherGuest = otherGuest+ ", " +input.next();
                System.out.println("Do you want to enter new guest name:");
                guestWant = input.next();
                if(guestWant.equals("no")){
                    System.out.println("Guest's list: " + guestName + otherGuest);
                }
            }
        }

        String name="", yesOrNo="", listOfGuests="";

    }
}
