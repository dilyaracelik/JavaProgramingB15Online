package day14;

public class LastIndexOf {
    public static void main(String[] args) {

        String name = "Game of Java";

        System.out.println("Last location of letter a");
        System.out.println(name.lastIndexOf("a"));

        System.out.println("Last location of character space");
        System.out.println(name.lastIndexOf(" "));

        System.out.println("Last location the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

        System.out.println("Last location of letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));

    }
}
