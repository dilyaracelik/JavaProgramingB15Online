package day17;

public class ReverseMyName {
    public static void main(String[] args) {

        String name = "Sevim";

        int x = name.length()-1;
        while (x >= 0) {

            System.out.println(name.charAt(x));
        --x;
        }

String name1 = "Berk";
        for (int i = name1.length()-1; i < 0 ; i++) {
            System.out.println("i = " + i);
        }



    }
}
