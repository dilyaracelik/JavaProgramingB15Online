package day17;

public class OddEvenWithinTheRange {
    public static void main(String[] args) {

        //Write a program to print out an even number from 0 to 50 ;
//Write a program to print out an even number from 0 to 50 ;

        int evenNumber = 0;
        while (evenNumber <= 50) {
            System.out.print(evenNumber + " ");
            // evenNumber= evenNumber+2;
            evenNumber += 2; //increase every number by 2 for odd numbers
        }

        System.out.println("\n------------------------");

        int oddNumber = 1;
        while (oddNumber <= 50) {
            System.out.print(oddNumber + " ");

            oddNumber += 2; //1 den basladigimiz icin 3 ekliyoruz!!!!!! odd number oluyor

        }
        System.out.println("\n------------------------");

        int counter = 0;

//        if (counter%2 == 0){
//            System.out.println(counter + " is an even number");
//        } else {
//
//            System.out.println(counter + " is an odd number");
//        }

       int cnt3 = 0;
        while (cnt3 <= 50) {

            if (cnt3 % 2 == 0) {
                System.out.println(cnt3 + " is even number");
            } else {
                System.out.println(cnt3 + " is odd number");
            }
            ++cnt3;
        }

        }}












