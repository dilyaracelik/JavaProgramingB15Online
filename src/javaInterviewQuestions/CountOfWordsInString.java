package javaInterviewQuestions;

public class CountOfWordsInString {

    public static void main(String[] args) {

        //1st way . Space yerine \\s 'de koyabiliriz
        String str = "I love Java and Selenium too much";

        int count = 0;

        String[] arr = str.split(" ");
        System.out.println(arr.length);

        System.out.println("=========================");

        //2nd way
        String str2 = "I love watching horror movies";

        int countnew = 1; //we start from 1 bec. want to count 1st word

        for (int i = 0; i < str2.length(); i++) {
//if there is a space after the char. AND char+1 is NOT a space --> count++
            if ((str2.charAt(i) == ' ') && (str2.charAt(i + 1) != ' ')) {
                countnew++;
            }
        }
        System.out.println("countnew = " + countnew);

    }
}
