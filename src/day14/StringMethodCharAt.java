package day14;

public class StringMethodCharAt {
    public static void main(String[] args) {


        String name = "Berk";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

  String name1 = "Sevim";

        System.out.print(name1.charAt(0) + " "); //space de birakabilirsin
        System.out.print(name1.charAt(1));
        System.out.print(name1.charAt(2));
        System.out.print(name1.charAt(3));
        System.out.println(name1.charAt(4));

        char c1 =name1.charAt(0); //ascii table
        char c2 =name1.charAt(1);
        char c3 =name1.charAt(2);
        char c4 =name1.charAt(3);
        char c5 =name1.charAt(4);

        System.out.println(  c1+ " " +  c2 + " " + c3 + " " + c4 +
                " " + c5 ); //without spaces it sees as ascii numbers

    }
}
