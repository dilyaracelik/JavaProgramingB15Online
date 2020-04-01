package javaInterviewQuestions;

public class FindLargestOf3Numbers {
    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 12;
        int num3 = 34;


        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is largest number.");
        } else if (num2 > num1 && num2 > num3) {

            System.out.println(num2 + " is largest number.");
        } else {

            System.out.println(num3 + " is largest number.");
        }

        System.out.println();

//Ternary operator

        int largest = num1 > num2 ? num1 : num2;
        largest = num3 > largest ? num3 : largest;
        System.out.println("largest = " + largest);


    }
}
