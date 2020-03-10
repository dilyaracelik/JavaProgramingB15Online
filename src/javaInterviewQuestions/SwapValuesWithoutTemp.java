package javaInterviewQuestions;

public class SwapValuesWithoutTemp {
    public static void main(String[] args) {


        int  a = 10;      int  b  = 20;

        int temp= a; //10
        a= b; //20
        b=temp; //10

        System.out.println("with temp a: " + a+", b: " + b);

        a= a+b;  //30
        b= a-b;  //30-20= 10
        a= a-b;   //30-10= 20

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("==================");
        //with temp:









    }
}
