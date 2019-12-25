package day12;

public class CorollaFan_CarShopping {
    public static void main(String[] args) {

 //Buy Corolla or Tesla  (only if it is within the budget)

        //there is only 1 car covered with cloth
        //we don't know what car is it and what is the price
        //once we take out the cloth
        //we check if it's toyota, if it's we buy it without checking the price
        //if it is not we check if it's a Tesla and also check if it is within the
        //budget

        String carBrand = "Corolla";
        int budget = 40000 ;
         int carPrice = 30000;
        /* if (carBrand.equals("Corolla") || (carBrand.equals("Tesla") && carPrice <= budget)) {
             System.out.println("Car aquired!");
         } else {
             System.out.println("Not what I am looking for!");
         }
*/

     //Another way:
        if (carBrand.equals("Corolla")) {
            System.out.println("Corolla acquired.");
        }else if (carBrand.equals("Tesla")  && carPrice <= budget ) {
            System.out.println("Car acquired.");
        }else {
            System.out.println("Not what I am looking for!");
        }

/* TEACHERS WAY
String carBrand = "corolla";

        int carPrice = 60000;
        int budget = 60000;
//        if( carBrand.equals("corolla")  ||   (carBrand.equals("Tesla") && carPrice <= budget)   ){
//
//            System.out.println(" CAR ACQUIRED !!!");
//
//        } else{
//            System.out.println("NOT WHAT I AM LOOKING FOR ");
//        }
        if (carBrand.equals("corolla")) {
            System.out.println(" COROLLA CAR ACQUIRED !!!");
        } else if (carBrand.equals("Tesla") && carPrice <= budget) {
            System.out.println(" TESLA CAR ACQUIRED !!!");
        } else {
            System.out.println("NOT WHAT I AM LOOKING FOR ");
        }
 */















    }
}
