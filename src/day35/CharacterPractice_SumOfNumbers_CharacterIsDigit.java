package day35;

public class CharacterPractice_SumOfNumbers_CharacterIsDigit {
    public static void main(String[] args) {



        char myChar = '7';
        // get int 7
        int myNum = Integer.parseInt(myChar + "");
        System.out.println("myNum = " + myNum);

        // Character.toString(myChar)
        // String.valueOf(myChar)


        String str = "A34B123C4X";
        //for each char in string check if it is number
        // if yes store in a String and use that string to get Integer
        // then sum it up
        char[] allChars = str.toCharArray();

        int sum = 0;
        for (char each : allChars) {
            //  checking whether each char is a number or not
            if (Character.isDigit(each)) {
                // if it's print out to see
                System.out.println("each = " + each);
                // then turn it into int using parseInt method
                // parseInt only accept String
                // so we need to pass String by adding "" to each
                int eachNum = Integer.parseInt(each + ""); // "" bunu kullanarak stringe cevirdik
                // now we can numerically add the number to sum
                sum = sum + eachNum;

            }
        }
        System.out.println("sum = " + sum);


    }

}

//ANOTHER WAY!! WITH FOR LOOP
//    int sum=0;
//        for (int i = 0; i < str.length(); i++) {
//        if (Character.isDigit(str.charAt(i))) {
//        sum +=Integer.parseInt(str.substring(i, i+1));
//        }
//        }
//        return sum;
//        }