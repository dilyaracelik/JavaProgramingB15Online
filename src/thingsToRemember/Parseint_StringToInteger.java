package thingsToRemember;

public class Parseint_StringToInteger {
    public static void main(String[] args) {

        String s= "102"; //integera cevirmezsek 102+4=1024 olur
        int n= Integer.parseInt(s); //cevirirsek 102+4=106 math yapabiliriz
        System.out.println(n+4);
//RETURNING A STRING BACK INTO INTEGER

        int i =8;
        System.out.println(Integer.toString(i)+1);


    }
}
