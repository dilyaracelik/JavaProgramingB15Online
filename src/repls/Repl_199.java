package repls;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_199 {
    public static void main(String[] args) {

        ArrayList <String> str = new ArrayList<>(Arrays.asList("hey","yo"));



    }
    public static void removeAll(ArrayList<String> wordList, String targetWord){
while (wordList.contains(targetWord)){
wordList.remove(targetWord);

}

        System.out.println(wordList);
    }

}
