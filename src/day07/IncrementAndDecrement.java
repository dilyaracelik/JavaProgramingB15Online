package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        //increment operator
/*Shorthand/Compound Operator
int score = 10 ;
  //score  = score + 4 ;
+= , -= , *= , /=  ,%=    NO SPACE IN BETWEEN !!!!!
    score +=4 ;   // —>> 14
   score  *=3 ;   // 42
   score  /= 2 ;  //  21
   score %= 5;  // —>> remainder is 1  : // 5*4+1 = 21 //  21/5= 4 arada kalan 1, bolme yaptiginda
                                                       //5+5+5+5 = 20 and +1 = 21 ya da boyle hesaplanir
// —— The special case of increasing and decreasing numbers by 1
//. —>> increment and decrement operator come in :  ++ - -
  int  offer = 2 ; */
//  ++ is called increment operator
//It’s very different from just + , because it takes two numbers and add them
//  ++ will take one number variable and increase the value by 1
// 5 + 7  =  12 ;  GOOD !
//        5 ++ 7 =  —>> ERROR!!!!!!!!
//      ++score  —>> good! Increment the score by 1



            //    ++ - -  CAN ONLY BE USED FOR ONE NUMBER VARIABLE


        int apple = 10;
        //apple = apple + 1;
        //apple += 1;
        ++apple; //increasing the value by 1 short cut
        ++apple;
      System.out.println(apple);

      //decrement operator
      //apple= apple-1
        //apple -=1;
        -- apple;
        //System.out.println("used ++ to increase apple);

System.out.println(++apple);
                                                     //(++ apple) boyle de yazabilirsin
        System.out.println("used ++apple to increment and concatenate: "  +  ++apple);

    }
}