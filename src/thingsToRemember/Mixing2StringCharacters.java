package thingsToRemember;

public class Mixing2StringCharacters {
    public static void main(String[] args) {

        //output will be 1a2b3c4d5e

        String s1 = "12345";
        String s2 = "abcde";


        String s = "";
        for (int i = 0;i<s1.length();i++)
            s += s1.substring(i,i+1)+s2.substring(i,i+1);
        System.out.println(s);


    }}

