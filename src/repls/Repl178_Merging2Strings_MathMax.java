package repls;

public class Repl178_Merging2Strings_MathMax {
    public static void main(String[] args) {

        String one = "spoon";
        String two = "soho";

        String result ="";
        int max = Math.max(one.length(),two.length());

        for (int i = 0; i < max ; i++) {

            if (i<one.length()){
       result += one.charAt(i);
            }
if (i<two.length()){
    result += two.charAt(i);
}

        }
        System.out.println(result);




        }
    }