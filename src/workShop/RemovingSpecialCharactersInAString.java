package workShop;

public class RemovingSpecialCharactersInAString {
    public static void main(String [] args) {

//        Reverse a string without affecting special characters
//        Given a string, that contains special character together with alphabets
//        (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
//        Input:   str = "a,b$c"
//        Output:  str = "c,b$a"
//        Note that $ and , are not moved anywhere.
//                Only subsequence "abc" is reversed.
//        Input:   str = "Ab,c,de!$"
//        Output:  str = "ed,c,bA!$"
//        Input:   str = "----qwe--r--tyf...gd.---"
//        Output:  str = "----dgf--y--tre...wq.---"


        String word = "Ab,c,de!$";

        String reversed = "";
        for (int i = 0; i < word.length() ; i++) {

            if ((word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') || (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                reversed += word.charAt(i);

            }
        }
            System.out.println(reversed);



    }
}


