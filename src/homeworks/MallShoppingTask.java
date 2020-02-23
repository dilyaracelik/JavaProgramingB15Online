package homeworks;

public class MallShoppingTask {
    public static void main(String[] args) {


        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
//TASK 1. Check if all 3 arrays are exact same length
        //Print "All arrays are equal length"
        System.out.println(items.length);
        System.out.println(prices.length);
        System.out.println(itemIDs.length);
        if (items.length == prices.length && itemIDs.length ==items.length) {
            System.out.println("All arrays are equal length");
        }

        //TASK 2. Print how many items purchased
        System.out.println("Purchased items count is, " + items.length);
       
        //TASK 5. Find the most expensive item and print all details
        //{99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}

       // int maxPriceIndex = 0;
double maxPrice = prices[0];
        for (int i = 0; i < items.length; i++) {
            if (prices[i]>maxPrice){
               maxPrice=prices[i];

            }

        }

        int maxPriceIndex = 0;
        for (int i = 0; i <prices.length ; i++) {
            if (prices[i]==maxPrice){
maxPriceIndex=i;


            }
        }

        System.out.println("Most expensive item:");
        System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);




    }




            }

