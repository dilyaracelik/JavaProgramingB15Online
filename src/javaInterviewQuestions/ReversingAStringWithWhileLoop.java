package javaInterviewQuestions;

public class ReversingAStringWithWhileLoop {
    public static void main(String[] args) {


        String str = "Selenium";
   String reversed = "";
        int i = str.length()-1;
        while (i>=0){

            reversed += str.charAt(i);
            i--;
        }
        System.out.println(reversed);
    }
}
