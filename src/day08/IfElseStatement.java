package day08;

public class IfElseStatement {
    public static void main(String[] args) {


        int speedLimit = 60 ;
        int yourCurrentSpeed = 45 ;
        // if the yourCurrentSpeed is more than speed limit
        // get pulled over by the police
        // given ticket by the police
        // taken away some points on your license
        // go to court
        boolean IamSpeading =   yourCurrentSpeed > speedLimit  ;
        //Inside a parentheses you can only put
        // boolean value =true or false
        //boolean variable
        //any expression that may return boolean value -true or false

        //if( IamSpeading ) {

       // if (true);{
        if (yourCurrentSpeed > speedLimit ) {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        } else {
            System.out.println("go shopping !!");
            System.out.println("Buy IceCream !!");
            System.out.println("Enjoy your Day !!");
        }
        // if not over the limit
        // go shopping !!
        // outside if statement , say the end


        System.out.println("THE END");









    }




}
