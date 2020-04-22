package BootCamp;

public class ReverseWordsInASentenceWithMethod {


    public static void main(String[] args) {
        reverse("Sevim, neden bu kadar cok uyuyorsun");

        System.out.println(" ");
        System.out.println(reverseReturn("I love Java"));
    }


    public static void reverse(String sentence) {
        String[] arr = sentence.split(" ");
        for (String each : arr) {
            for (int i = each.length() - 1; i >= 0; i--) {
                System.out.print(each.charAt(i));
            }
            System.out.print(" ");
        }
    }

    public static String reverseReturn(String sentence) {
        String reversed = "";
        String[] arr = sentence.split(" ");
        for (String each : arr) {
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            reversed += " ";
        }
        return reversed.trim();
    }


}
