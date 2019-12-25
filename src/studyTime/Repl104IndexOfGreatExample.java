package studyTime;

import java.util.Scanner;

public class Repl104IndexOfGreatExample {
    public static void main(String[] args) {
//        Example:
//     {"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}

//        output:
//        First name: James
//        Last name: May
//
//        Hint:  Use substring() method in order to slice this variable, and i
//    ndexOf()method in order to identify position of characters.

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();


       String firstName = json.substring(json.indexOf("firstName")+13, json.indexOf("\","));
        System.out.println("First name: " + firstName);


        //to find the lastName use lastName as starting point add 12 (+) index of " at index 50
        String lastName = json.substring(json.indexOf("lastName")+12,json.indexOf("\"",50));
        System.out.println("Last name : " + lastName);
// to find the location of the first name, I used index of method starting from the "firstName" (letter -f)
// which starts index 13.

//





    }
}
