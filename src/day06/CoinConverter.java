package day06;

public class CoinConverter {


    public static void main(String[] args) {

        //you have 200 cents
        //how many quarter u can get --> 25c
        //how many dime you can get --> 10c
        //how many nickel u can get --> 5c
        //how many penny u can get -->

        int cent = 200;

        //System.out.println();
        //you have purchased candle for 74 cent, what would be your your remainder.

        cent -= 74;             //126 cent 200-74= 126
        int quarter = cent/25;  //
        int penny = cent%25;
        System.out.println(quarter);
        System.out.println(penny);

        //now I want to try to calculate dime for some money I got after purchase

        int dime = cent / 10; // --->  126/10 --> 12 remainder is 6
        //how much penny I have after getting dime 126 % 10 --> 6
        //creating new penny2 for not mixing with previous one
        int penny2 = cent% 10; /////--->
        System.out.println(dime);
        System.out.println(penny2);



    }
}
