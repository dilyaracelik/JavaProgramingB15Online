package day21;

public class OrderOfBreakContinueUnreachableCode {
    public static void main(String[] args) {


        for (int x = 0; x < 10 ; x++) {


            continue;

            //this will not work, unreacheable code!!
          //  System.out.println("Hello"); unreachable
        }

            System.out.println("The end");

}}
