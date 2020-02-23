package thingsToRemember;

public class RemovingTheDuplicatesInAString {
    public static void main(String[] args) {

        String str = "AAABBBDDDEEE"; //EXPECTED RESULT ABDE

        String result = "";

        for (int i = 0; i <str.length() ; i++) {

            if(!result.contains(str.substring(i, i+1))) {
                result += str.substring(i, i + 1);

            }
        }
        System.out.println("result = " + result);

    }


}


