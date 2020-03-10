package workShop;

import java.util.Arrays;

public class Repl204 {

    public static void main(String[] args) {

        System.out.println(isAnagram("silent", "listen"));

    }
    public static boolean isAnagram(String word1, String word2) {


        char[] chr1 = word1.toLowerCase().toCharArray();
        char[] chr2 = word2.toLowerCase().toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        return Arrays.equals(chr1,chr2);


}


}
