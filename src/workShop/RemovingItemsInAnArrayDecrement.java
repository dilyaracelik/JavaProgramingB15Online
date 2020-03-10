package workShop;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingItemsInAnArrayDecrement {
    public static void main(String[] args) {


        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","yo", "yo", "hi", "hello"));

        String targetWord = "yo";
       removeAll(wordList,targetWord);




    }
    public static void removeAll(ArrayList<String> wordList, String targetWord){
        for (int i = 0; i<wordList.size() ; i++) {
            if( wordList.get(i).equals(targetWord)){
                wordList.remove(targetWord);
                i--;
            }
        }

        System.out.println(wordList);

    }}