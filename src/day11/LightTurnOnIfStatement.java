package day11;

public class LightTurnOnIfStatement {

    public static void main(String[] args) {

        /*
Create a variable  targetOption as String and assign one of below options  for example bd
You have 4 switches in your home to turn on
	  Bd — bedroom
      Lr  — living room
	  ki  — kitchen
      Ha— Hallway
Use switch statement to write a program to print which room light is turned on
For example if Bd was targetOption
	then print  you have turned on bedroom light  */

        //there is a targetOption that store my option
        // and it looks like it has 2 character so i use String as data type
       // String targetOption = "Ha" ;
        // what can be the data type of the variable inside switch
        // byte, short , int , char , String

       String targetOption = "ha";


       if ( targetOption == "bd") {
           System.out.println("You turned on bedroom light.");
       } else if ( targetOption == "lr") {

           System.out.println("You turned on livingroom light.");
       } else if ( targetOption == "ki") {

           System.out.println("You turned on kitchen light.");}
       else if ( targetOption == "ha") {

           System.out.println("You turned on hallway light.");}
       else {
           System.out.println("There is not such a room...");
       }











    }


}
