package StringBuilder;

public class ReversingAStringWithStBuilder {
    public static void main(String[] args) {


        String word = "apple";
        StringBuilder word2 = new StringBuilder(word);
        System.out.println(word2.reverse());
    }

    //method for palindrome with string builder
    public static boolean isPalindromeWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);

    }
}
