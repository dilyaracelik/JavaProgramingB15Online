package thingsToRemember;

public class VowelsCount {
    public static void main(String[] args) {


        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends"));



    }

    public static int countVowels(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'u') || (ch == 'i')) {
                count++;

            }


        }
        return count;

    }}
