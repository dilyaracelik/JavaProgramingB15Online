package thingsToRemember;

import org.w3c.dom.ls.LSOutput;

public class NestedLoop_Diamonds {
    public static void main(String[] args) {

        //repeat a loop multiple times
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println(); //break the line
        }
//declare initialization firs
        System.out.println("=====================================");

        int z = 5;
        while (z > 0) {
            int i = 1;
            while (i <= 5) {
                System.out.print("*");
                i++;

            }
            System.out.println();
            z--;
        }

        System.out.println("=====================================");


        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *

         *///1st loop prints 5 stars on the console, if I want to print 5 more times I need another loop.
        //inner loop decides what to print inside

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {  //i yukarida 1 ken 1 yildiz yapmazi icin j<i -- i 1'sa j'de 1 olmali gibi
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n"); //for space between tasks

        for (int i = 5; i >=0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }

            System.out.println();
        }




    }
}