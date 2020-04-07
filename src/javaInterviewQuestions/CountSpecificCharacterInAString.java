package javaInterviewQuestions;

public class CountSpecificCharacterInAString {

    public static void main(String[] args) {

        // here I will count the number of "a"s in this String...

        String s = "Java Programming Java oops";

        int fullLenght = s.length();

        int lengthWithoutas = s.replace("a", "").length();

        int numOfas = fullLenght - lengthWithoutas;

        System.out.println("Number of a's in the string = " + numOfas);


    }
}
