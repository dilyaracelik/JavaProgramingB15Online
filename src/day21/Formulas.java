package day21;

public class Formulas {
    public static void main(String[] args) {


//  01234
//       // Hello
//        while we are going through all characters
//        where do we stop in the loop :
//                                          4               5
//        for 1 character   -->>   x<=lastCharIndex , x < charCount
//                                       3(x<=3)          4 (x<4)              3(x<=3)
//        for 2 characters  -->>   x<=lastCharIndex-1 , x < charCount - 1 ,  x <= charCount-2
//                                       2 (x<=2)            3 (x<3)            2 (x<=2)
//        for 3 characters  -->>   x<=lastCharIndex-2 , x < charCount - 2 ,  x <= charCount-3
//
//
//        if you are looking for a word with n characters
//        where is my stopping point
//
//                                  n-1 ( x<= n-1)        n (x < n  )
//        for n characters  -->>  x<=lastCharIndex-n-1 ,  x < charCount - n-1 , x <= charCount-n
//        01234567890   11 character and last char index is 10
//        String abc = "hello world"  ;   x <= charCount-n
//        I want to get 4 characters at a time
//        WHAT IS MY CONDITION     x <= 11-4 = 7

    }
}
