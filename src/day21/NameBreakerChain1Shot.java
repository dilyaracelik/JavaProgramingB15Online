package day21;

public class NameBreakerChain1Shot {
    public static void main(String[] args) {

        String name = "Nursultan";

        //CHAIN THE METHOD WITHOUT SAVING EACH CHAR

        for (int x = 0; x < name.length(); x++) {

            if (name.substring(x, x + 1).equalsIgnoreCase("l")) {
                System.out.println("Found it!!");
                break;
            }

            System.out.println(name.substring(x, x + 1));
        }
//sout'u yukari koyarsan "l" de cikar consoleda.
    }


}







