package day05;

public class VariablePractice {
    public static void main(String[] args) {

        /*boyle de olur comment
        block comment denir
         */
//String is not a PRIMITIVE TYPE!!


        /*

          whole numbers         : byte , short , int , long
          fractional numbers    : float , double
          logical               : boolean (true , false)
          character             : char (single character in single quote)
        usually by default for whole numbers :  just use int
        usually by default for fractional numbers :  just use double

 String is sequence of character
        */

//   TASK 1: Age calculator
        //given birt year, pls calculate the age
        int birthYear = 2001;
        int currentYear = 2019;
        int age  = currentYear -birthYear;
        //I was born in year 2001, and I am 18 years old; --->output

        //System.out.println("I was born in " + + 2001 + " +  and I am " + (2019-2001) + " years old" + "." );
        System.out.println ("I was born in " + birthYear + ", and I am " + age + " years old" + ".");

        //Task 2: YOU ARE SPEEDING TODAY
        //speed limit is some number, your current speed is this
        //generate this output of: You're driving 10 mph more than the speed limit

        int speedLimit = 40;
        int currentSpeed = 50;
        int overTheLimit = currentSpeed - speedLimit ;


        System.out.println(" The speed limit is " + speedLimit + " and my current speed is " + currentSpeed + ", so I am driving " + overTheLimit + " mph more than the speed limit"+ ".");





    }

}
