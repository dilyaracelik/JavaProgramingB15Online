package day21;

public class ReverseNumberStaircase {
    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {
            for (int j = i; j<= 4 ; j++) {

                System.out.print(j + "");
            }
            System.out.println();
        }

        for (int x = 1; x <= 10; x++) {
            //System.out.println("x  :" + x );


            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();


    }
}}
