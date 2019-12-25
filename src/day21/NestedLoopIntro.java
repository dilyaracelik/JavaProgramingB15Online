package day21;

public class NestedLoopIntro {
    public static void main(String[] args) {



//        for (int x = 1; x <= 5; x++) {
//            System.out.print( x + " " );
//        }
//        System.out.println();
//
//        for (int x = 1; x <= 5; x++) {
//            System.out.print( x + " " );
//        }
//        System.out.println();
//
//        for (int x = 1; x <= 5; x++) {
//            System.out.print( x + " " );
//        }
//        System.out.println();

         // count from 1 to 5

        // repeat this 3 times
        for (int i = 1; i <= 3; i++) {   //how many times to repeat

            System.out.println("ITERATION : " + i);

            for (int x = 1; x <= 5; x++) { //tells the numbers to be counted
                System.out.print(x + " ");
            }
            System.out.println(); //bosluk birakmak icin


        }








    }
}
