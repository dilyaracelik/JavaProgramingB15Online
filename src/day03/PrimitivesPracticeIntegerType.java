package day03;

public class PrimitivesPracticeIntegerType {


    public static void main(String[] args) {


        byte letterCount = 26;
    System.out.println("The number of the letters in the alphabet is " + letterCount + "." );

    short sheepCount = 300;
        System.out.println("The number of the sheeps in the farm is " + sheepCount + "." );

    int catCount = 20;

        System.out.println("There are " + catCount + " cats in the house." );

    long mileToSun = 100000000L; // KUCUK BUYUK l L OLABILIR

       System.out.println(" I just learned that from earth to sun is " + mileToSun + " miles" + " :)" + ".");
//---------floating point---------------
        //upper case lower case dont matter
    float priceOfBanana = 1.99f;
        System.out.println( "The price of the banana in Trader Joe's is " +  priceOfBanana + (".") );             //you must add f F at the end to indicate this is float data type,
    float priceOfPotato = 2.49F;
        System.out.println ("The price of the potato is " + priceOfPotato + "." );

//float icin f olmali yoksa calismaz.

//-----larger floating point numbers------

    double priceOfIpad1 = 355.99D;
        System.out.println("The price of the Ipad1 is " + priceOfIpad1 + ".");
    double priceOfIpadPro = 1024.99d ;
        System.out.println("The price of the Ipad-pro is " + priceOfIpadPro + (".")  );
//compiler automatically assume it is double, so it is not required to have d
// however 4 good habit add them ALWAYS!
    double priceOfMac = 2299.99;


//If u have a whole number by itself (10,100), compiler automatically assume it is an int
//If u have a fractional number by itself, compiler automatically assume it is an double

// SELF STUDY PART




    }



}
