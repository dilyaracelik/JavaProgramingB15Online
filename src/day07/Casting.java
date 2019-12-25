package day07;

public class Casting {

    public static void main(String[] args) {


//int num = 10;

        //10 is implicitly (automatically) converted to double 10.0
        //and stored inside bigNum behind scene
        //double bigNum = 10;
        //System.out.println(bigNum);

        //int num = 12.99; -- hata verir // 12.99 is double, double has much bigger range than int
        // and it doesn't fit.
        //int num = 12.99;  //compiler ERROR!! soyle yapabilirsin asagida;

       // int num = (int) 12.99; ///cast int yapiyor // sadece whole number gozukur 12
        //System.out.println(num);

        //create a long variable and store int
        //create  an int variable and try to store above Long value
        long distanceToSun = 10000; // 10000L
        int distanceToSun_int = (int) distanceToSun;
        System.out.println(distanceToSun_int);

    // example --->  int int1 = (int) (5/2.00);




    }






}
