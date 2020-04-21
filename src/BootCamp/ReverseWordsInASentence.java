package BootCamp;

public class ReverseWordsInASentence {

    public static void main(String[] args) {


// print all the words in reverse order in a string without changing the order of the sentence.
//1st way
        String str = "Tomorrow will be sunny";

        String[] words = str.split(" ");

        for (String word : words) {
            char[] chrArr = word.toCharArray();

            for (int i = chrArr.length - 1; i >= 0; i--) {
                System.out.print(chrArr[i]);
            }
            System.out.print(" ");
        }

        System.out.println("\n");

//2nd way
        String str2 = "I don't like github";

        String[] arr = str2.split(" ");

        for (String each : arr) {

            for (int i = each.length() - 1; i >= 0; i--) {
                System.out.print(each.charAt(i));
            }
            System.out.print(" ");
        }


    }
}
