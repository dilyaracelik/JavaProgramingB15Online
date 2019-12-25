package day05;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {

        //Grocery Shopping
        //    ask user whats the price of tomato and store it
        //    ask user how many tomato you want to buy and store it
        //    ask user whats the price of potato and store it
        //    ask user how many potato you want to buy and store it
        //    ask user whats the price of banana and store it
        //    ask user how many banana you want to buy and store it
        //
        //generate this example output
        //     You got 3 tomato price is 2.99 and total -->>
        //     You got 5 potato price is 3.49 and total -->>
        //     You got 2 banana price is 1.99 and total -->>
        //
        //     Your grand total for this shopping is ???

// ---------> tomato

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the price of the tomato?:");
        float priceT = scan.nextFloat();
        System.out.println("How many tomato do you want to buy?:");
        int numberOfTomato = scan. nextInt();
        double totalPriceT = priceT * numberOfTomato;
        System.out.println("You bought " + numberOfTomato + " tomatoes and the price of the tomato is " + priceT + " and you paid " + totalPriceT + ".");



 //-------> potato

        System.out.println("What is the price of the potato?:");
        float priceP = scan.nextFloat();
        System.out.println("How many potato you want to buy?:");
        int numberOfPotato = scan.nextInt();
        double totalPriceP = priceP * numberOfPotato;
        System.out.println("You bought " + numberOfPotato + " potatos and the price of the potato is " + priceP + " and you paid " + totalPriceP + ".");

// ------>
        System.out.println("What is the price of the banana?:");
        float priceB = scan.nextFloat();
        System.out.println("How many banana you want to buy?:");
        int numberOfBanana = scan.nextInt();
        double  totalPriceB = priceB*numberOfBanana;


        System.out.println("You bought " + numberOfBanana + " bananas and the price of the banana is " + priceB + " and you paid " + totalPriceB + ".");

        double grandTotal = totalPriceB+totalPriceP+totalPriceT;
        System.out.println("Your total for this shopping is " + grandTotal + ".");


//  System.out.println("what is the price for potato");
//        float potatoPrice = scan.nextFloat();
//        System.out.println("How many you want to buy ?");
//        int potatoCount = scan.nextInt();
//        float potatoTotal = potatoPrice * potatoCount;
//        System.out.println("Your total for potato is " + potatoTotal);

    }



}
