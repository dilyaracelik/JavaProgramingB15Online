package workShop;

public class WordCountOfAString {
    public static void main(String [] args) {


//        This method gets a string and returns the word count of that string.

//        wordCount("foo bar")
//        returns 2


        System.out.println(wordCount("one two"));
    }

    public static int wordCount(String words) {

        String[] words2 = words.split(" ");


return words2.length;
}

}
