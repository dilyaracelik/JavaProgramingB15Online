package javaInterviewQuestions;

public class RemovingWhiteSpacesInAString {
    public static void main(String[] args) {

        String str = "Java       Is     Fun";

//  s here stands for space
        str = str.replaceAll("\\s", "");

        System.out.println("After removing white spaces = " + str);

    }
}
