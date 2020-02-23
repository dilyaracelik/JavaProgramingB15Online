package day26;

import java.util.Arrays;

public class ArraySummaryLengthLastItem1 {
    public static void main(String[] args) {



        int [] myNumbers = new int [4];   // 4 is item count

        myNumbers[0]  = 10 ;
        myNumbers[1]  = 40 ;
        myNumbers[2]  = 30 ;
        myNumbers[3]  = 7 ;
        // how do we get the size of an array
//        int size = myNumbers.length  ; // 4
//        int lastIndex = size -1 ;  //myNumbers.length-1
//
//        short lastItemValue = myNumbers[3] ;


     myNumbers[2]=myNumbers[0]+myNumbers[1];
        System.out.println(myNumbers[2]);


    }
}
