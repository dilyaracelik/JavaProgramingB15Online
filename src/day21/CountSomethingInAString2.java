package day21;

public class CountSomethingInAString2 {
    public static void main(String[] args) {

        String myName = "Amelia Israfil Hajitev mehmet Hajitev Amelia  Ashr Behlia";

        int charCount = myName.length();   // character count
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;  // last character index is always 1 less than character count
        System.out.println("lastCharIndex = " + lastCharIndex);
        int counter = 0;

        System.out.println("---counting certain 3 chars ---");
        //for (int x = 0; x < charCount-3 ; x++) {  // will do the same in different way
        for (int x = 0; x <= lastCharIndex - 2; x++) {
            //  for (int x = 0; x < charCount - 3; x++) {  // will do the same in different way
            //for (int x = 0; x <= lastCharIndex - 2; x++) {

            // saving the current 3 characters
            String current3Chars = myName.substring(x, x + 3);


        }
    }
}