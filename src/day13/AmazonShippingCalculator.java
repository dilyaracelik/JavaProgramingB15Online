package day13;

public class AmazonShippingCalculator {
    public static void main(String[] args) {
        /*
        Amazon has 2 type user; Prime and regular members.

        Prime members get the free shipping in all purchase
        no matter the amount.
        Regular user get free shipping only if their purchase is more than $25.
        Otherwise they get $5 shipping fee.
        Create a shipping calculator for Amazon. */


        String memberType = "Prime member";
        double amount = 15.99d;
        int shippingFee = 0;

        // first i wanna check it's prime memeber or not
        if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println("YOU GET 1 DAY FREE SHIPPING !!!!!");
            System.out.println("your final price is " + amount);
            //}else if( amount > 25 ) {
        } else if (!memberType.equalsIgnoreCase("PRIME MEMBER") && amount > 25) {

            System.out.println("NOT A PRIME MEMBER BUT YOU ORDER IS MORE THAN 25");
            System.out.println("YOU GOT FREE SHIPPING ON AMOUNT " + amount);
        } else {
            System.out.println("DO YOU WANNA SIGN UP FOR PRIME MEMBERSHIP? ");
            shippingFee = 5;
            amount = amount + shippingFee; //amount  +=  shippingFee
            System.out.println("YOUR FINAL AMOUNT IS " + amount);

        }


    }}


