package day06;

import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {
  //Create a program to calculate the final discounted price of an Item
        //
        //Create 3 double variables  called  regularPrice , salePrice and discount
        //
        //Ask user question using scanner for regularPrice and discountPercentage
        //And save the result into the variable
        //
        //Calculate sale price using above information
        //For example :  80 regular price , 0.2 for discount  , salePrice —>> 64
        //
        //Print out  : regular price is 80$ , discount is 0.2  and your got deal for 64 $

        Scanner scan =new Scanner(System.in);
        double regularPrice;
        double salePrice;
        double discount;
        //if you have variables the same datatype, you can declare them in 1 line like this --->
        //double regularPrice, salePrice, discount ;  ----> you can do this too.


        System.out.println("What is the regular price of the item?:");
        regularPrice = scan.nextDouble();

        System.out.println("What is the discount rate?:");
       discount = scan.nextDouble();

        salePrice = regularPrice - regularPrice*discount;

        System.out.println(" The regular price of the item is " + regularPrice + "$" + ", "
                + "discount rate is " + discount + "," + "" + " so the price will be " + salePrice + ".");

















    }


}
