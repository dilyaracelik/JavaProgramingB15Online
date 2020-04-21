package javaInterviewQuestions;

public class ThreeWaysToReverseString {
    public static void main(String[] args) {


        String str = "Sevi";
        
        StringBuffer strBuf = new StringBuffer(str);
        System.out.println(strBuf.reverse());

        System.out.println("======================");

        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+= str.charAt(i);
        }
        System.out.println("reversed = " + reversed);
        System.out.println("===============================");
        
        char[] asd = str.toCharArray();
        String reversed1 = "";
        for (int i = asd.length-1; i >=0 ; i--) {
            reversed1+= asd[i];
        }
        System.out.println("reversed1 = " + reversed1);
        
        
        
        
        
        
        
    }
}
