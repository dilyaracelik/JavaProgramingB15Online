package homeworks;

import java.util.Scanner;

public class StartingEndingCharacterStringForLoop {

    public static void main(String[] args) {
        //CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)

        Scanner scan = new Scanner(System.in);

        System.out.println("Please write a word: ");
        String word = scan.next();

            char firstLetter = word.charAt(0);
           char lastLetter = word.charAt(word.length()-1);

        System.out.print("The letters between the first and last character that you entered are: \n");
       if (firstLetter<lastLetter)

           for (char x = firstLetter; x <= lastLetter ; ++x)
           { System.out.print(x + "," );
           }
       else if (firstLetter>lastLetter)
           for (char i = firstLetter ; i >= lastLetter ; --i) {
               System.out.print(i + ",");
           }

       }
        }















