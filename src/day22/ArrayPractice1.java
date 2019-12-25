package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

//        double[] prices = new double[5];
//        System.out.println(prices[0]);
//        System.out.println(prices); //memory location cikar
//        //can't print out array variable directly to see what's inside.
//
//
//        prices[0] = 2.46;
//        prices[1] =12.96;
//        prices[2] = 992.1;
//        prices[3] =500;
//        prices[4] =65.123;
//
//        System.out.println(prices[0]);
//        System.out.println(prices[1]);
//        System.out.println(prices[2]);
//        System.out.println(prices[3]);
//        System.out.println(prices[4]);

//------------------------------------
// Create a char array that hold all the letters from your first name
// and assign values using each characters of your first name
// then print out each character


        char[] letters = new char[5];
      //what default value do we get for char array
      //we get a char represented by ascii code of 0
        System.out.println("<" + letters [0] + ">"); //it prints nothing, icinde value yoksa
                                                     //empty character


        letters[0] = 'S';
        letters[1] = 'e';
        letters[2] = 'v';
        letters[3] = 'i';
        letters[4] = 'm';

        //bu da olur.
        //  System.out.println(letters[0] + "" + letters[1] + letters[2] + letters[3] + letters[4]);

        System.out.println(letters[0]);
        System.out.println(letters[1]);
        System.out.println(letters[2]);
        System.out.println(letters[3]);
        System.out.println(letters[4]);


    //System.out.println(letters);
    // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
    // AND THIS IS ONLY FOR CHAR ARRAY , ANYTHING ELSE WILL PRINT MEMORY ADDRESS
    //System.out.println(letters);


        boolean[] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10 > 7;//true

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);
    }
}
