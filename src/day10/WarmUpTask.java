package day10;

public class WarmUpTask {
    public static void main(String[] args) {

        //create a class called Answer with main
        //create a variable called myAnswer as String with value of empty string

        //Create a variable called myNumber and assign any value
//if the number can be divided by 5 without remainder
        //assign myAnswer value to Fizz Number
        //if not assign the value to not a fizz number

        //Outside if else statement:
        //print my number is <>, it is <value of myAnswer here>


        String myAnswer = "";
        int myNumber = 46;

        if (myNumber % 5 == 0) {
            myAnswer = "Fizz Number";
        } else {
            myAnswer = "not a Fizz Number";
        }
        System.out.println("print my number is " + myNumber + " , It is  " + myAnswer);

    }


}
