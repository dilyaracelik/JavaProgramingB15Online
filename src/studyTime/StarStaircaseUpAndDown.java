package studyTime;

import java.util.Arrays;

public class StarStaircaseUpAndDown {
    public static void main(String[] args) {


        for (int i = 1; i <=5 ; i++) {   //row
            for (int j = 0; j <i ; j++) {    //column should be less than row
                System.out.print("*");
            }
           System.out.println();
        }
        for (int i = 4; i >0 ; i--) { //4 is numstars-1, yani 5-1=4 asagiya gittigi icin -
            for (int j = 0; j <i ; j++) {    //column should be less than row
                System.out.print("*");
            }
            System.out.println();
        }


    }

}


