package workShop;

import java.util.ArrayList;

public class Repl198_ArrayListReturnTypeCombineToArrays {
    public static void main(String[] args) {


    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {


        ArrayList<String> allArrs = new ArrayList<>();

        allArrs.addAll(wordList1);
        allArrs.addAll(wordList2);


        return allArrs;

//second way

//        public static ArrayList<String> combineAL (ArrayList < String > a, ArrayList < String > b){
//            ArrayList<String> comb = new ArrayList<>();
//            comb.addAll(a);
//            comb.addAll(b);
//            return comb;
//

    }

}