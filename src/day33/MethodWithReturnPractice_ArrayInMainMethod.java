package day33;

public class MethodWithReturnPractice_ArrayInMainMethod {
    public static void main(String[] args) {

        //TODO 2, OPTIONALLY , Create an int Array that has 5 numbers, test your code with those
        int[] allCodes = {5, 3, 11, 4, 33};

        for (int x = 0; x < allCodes.length; x++) {  //if you have many numbers you can do that, adjust the code
//Array yapip for loopla birden fazla number check edebilirsin
            String day = getDaysOfTheWeekFromNumber(allCodes[x]);
            System.out.println("day = " + day);

        }
        System.out.println("-------------");
        for (int eachCode : allCodes) {

            System.out.println("each day = " + getDaysOfTheWeekFromNumber(eachCode));


        }

    }

    /**
     * covertNumberToDay
     * This method will take number from 1-7
     * and convert that to actual day in word
     *
     * @param int dayCode to represent day in number
     * @return the day in word in English as String
     * if the number is valid
     * if the number is not 1-7 return INVALID DAY!
     */

    public static String getDaysOfTheWeekFromNumber(int num) {


        if (num == 1) {
            return "Monday";
        } else if
        (num == 2) {
            //  day = "Tuesday"; direkt return yazabilirsin
            return "Tuesday";
        } else if
        (num == 3) {
            return "Wednesday";
        } else if
        (num == 4) {
            return "Thursday";
        } else if
        (num == 5) {
            return "Friday";
        } else if
        (num == 6) {
            return "Saturday";
        } else if
        (num == 7) {
            return "Sunday";
        } else {
            return "Day is Funday!";
        }

//ALTTAKI ARRAYA DONUSTURUP YAPILDI, FARKLI BIR METHOD
        //    public static String getDaysOfTheWeekFromNumber2(int daycode){
//        String [] daysArray={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//        String day="";
//        if(daycode>0 && daycode<=7 ){
//            day=daysArray[daycode-1];
//        }else{
//            day="FUNDAY";
//        }​
//        return day;
//    }






    }


}
