package day10;

public class Calculator_V1 {
    public static void main(String[] args) {

/*
        // Create a class Calculator with main
        create a variable called operator with type char
        Assign the value for one of these 4 : + - * /
        char operator = ‘+’ ;
        use switch statement  to do following logic
        if the operator is +   print you are about to add numbers
        if the operator is -   print you are about to subtract numbers
        if the operator is *   print you are about to multiply numbers
        if the operator is /   print you are about to divide numbers
        If nothing match print invalid operator
        USE switch statement to complete this task
        */


        char operator = '&';

        switch (operator) {
            //this case is equivalent of saying if (operator=='+')  ifde boyle yapilir
            case '+' :  //char value oldugu icin '' icine al.
                System.out.println("You are about to add numbers" );
                break;
            case '-' :
                System.out.println("You are about to subtract numbers" );
                break;
            case '*' :
                System.out.println("You are about to multiply numbers" );
                break;
            case '/' :
                System.out.println("You are about to divide numbers" );
                break;
            default:
                System.out.println ("Invalid Operator");










        }













    }





}
