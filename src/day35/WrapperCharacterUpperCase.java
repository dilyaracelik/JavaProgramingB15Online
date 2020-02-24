package day35;

public class WrapperCharacterUpperCase {
    public static void main(String[] args) {

        String all="A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";


        String allUppercase="";
        String allLowerCase="";
        String numbersInString="";

//        Character charObject = Character.valueOf('a');
//        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a') );
//        System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
//        System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
//        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
//        System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
//        System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
//        System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
//        System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));

        for (int i = 0; i <all.length() ; i++) {
            if(Character.isDigit(all.charAt(i))){
                numbersInString=numbersInString+all.charAt(i);
            }
        }
        System.out.println("numbersInString = " + numbersInString);

        for (int i = 0; i <all.length() ; i++) {
            if(Character.isUpperCase(all.charAt(i))){
                allUppercase=allUppercase+all.charAt(i);
            }
        }
        System.out.println("allUppercase = " + allUppercase);
        System.out.println("all UpperCase to LowerCase = "+allUppercase.toLowerCase());


        for (int i = 0; i <all.length() ; i++) {
            if(Character.isLowerCase(all.charAt(i))){
                allLowerCase=allLowerCase+all.charAt(i);
            }
        }
        System.out.println("allLowerCase = " + allLowerCase);

        System.out.println("All lowerCase to UpperCase "+ allLowerCase.toUpperCase());


        //---------------//now i can find each number in string, convert it to int primitive and find sum

        int sum=0;

        for (int i = 0; i <all.length() ; i++) {
            if(Character.isDigit(all.charAt(i))){
                int nums=Integer.parseInt(all.charAt(i)+"");
                sum=sum+nums;

            }
        }
        System.out.println("sum = " + sum);
    }


}