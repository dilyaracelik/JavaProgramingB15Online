package workShop;

public class ReverseAStringMethodWithReturnType {
    public static void main(String[] args) {




        String input = "Sevim";

        System.out.println(reverse(input));
    }
    public static String reverse(String input)
    {

        String reversed = "";
        for (int i = input.length()-1; i >= 0; i--) {

            reversed += "" + input.charAt(i);

        }
        return reversed;

    }
}

