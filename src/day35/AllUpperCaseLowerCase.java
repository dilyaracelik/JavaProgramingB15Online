package day35;

public class AllUpperCaseLowerCase {
    public static void main(String[] args) {

        String all = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF",
                allUppercase="",
                allLowerCase="",
                numbersInString="";

        int sum=0;

        for(int i=0; i < all.length(); i++) {
            char ch = all.charAt(i);
            if(ch >= 97 && ch <= 122 ) { // ascii code of a is 97, z is 122.
                allLowerCase+=ch;
            }

            if(ch >= 65 && ch <= 90) { //ascii code of A is 65, Z is 90.
                allUppercase+=ch;
            }

            if(ch >= 48 && ch <= 57) {
                numbersInString += ch;
                sum += Integer.valueOf(""+ch);
            }

        }

        System.out.println(allLowerCase);
        System.out.println(allUppercase);
        System.out.println(sum);
    }
}
