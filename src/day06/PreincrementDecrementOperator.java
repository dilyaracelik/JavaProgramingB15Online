package day06;

public class PreincrementDecrementOperator {
    public static void main(String[] args) {

        //kisa yazmak icin farkli cozumler

        //initializing (giving value) offer count value to 2
        int offerCount =2;

        //increasing the number by 1 using normal way
        //offerCount = offerCount +1;

        //increasing the value by 1 using compound or shorthand operator ,
        //offerCount +=1;

        //increasing or decreasing a value very special
        //and often used in programing
        //there is even shorter shortcut for this operation
        //and we use ++ or --, THIS IS EXCULISEVELY FOR INCREASING AND DECRESING BY 1
        //We can not use it for any other time like increasing or decreasing the value by more than 1.

        ++offerCount; //en kisa boyle yazilir. this is same as //offerCount = offerCount +1; and
        System.out.println("Offer now after increasing by one " + offerCount);

        --offerCount;
        System.out.println("Offer now after decreasing by one " + offerCount);

//int value is 2 here.



    }

}
