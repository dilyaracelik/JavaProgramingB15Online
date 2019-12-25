package thingsToRemember;

import java.util.Scanner;

public class FindMiddle3Chars {
    public static void main(String[] args) {

//        If the word has odd number of characters
//        and has 5 or more characters, print the middle three
//        characters of the word.
//
//        Otherwise print "invalid".
//
//                fifteen ==> fte
//        apple ==> ppl
//        hey ==> invalid
//        java ==> invalid
//        whatsup ==> ats
//        $ ==> invalid

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int middle = word.length()/2;
if (word.length()%2==1  && word.length()>=5){   //12345
    word = word.substring(middle-1,middle+2);   //apple +2 because ortadakinden bir sonraki icin
    System.out.println(word);
}else {
    System.out.println("invalid");
}














    }
}
