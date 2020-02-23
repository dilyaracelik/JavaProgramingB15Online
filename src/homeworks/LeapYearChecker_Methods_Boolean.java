package homeworks;

public class LeapYearChecker_Methods_Boolean {
    public static void main(String[] args) {


        System.out.println(isLeapYear(1900));


    }
//    In the Gregorian calendar three criteria must be taken into account to identify leap years:
//    The year can be evenly divided by 4;
//    If the year can be evenly divided by 100, it is NOT a leap year, unless;
//    The year is also evenly divisible by 400.  Then it is a leap year.
//    Write a method

    public static boolean isLeapYear(int year) {

//create a boolean variable to check if true or false
//take int variable year
//assign a value to the variable
//check if the year is divisible by 4, 400 with if statement

        //TODO Your codes here

        boolean istrue = true;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }


    }
}







