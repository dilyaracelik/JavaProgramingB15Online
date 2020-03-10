package workShop;

public class FindDuplicatesInMethod {



    public static String RemoveDup (String str){

        //finding unique characters

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            if (!result.contains(str.substring(i,i+1))){

                result += str.substring(i,i+1);
            }

        }



        return result;
    }

    //write a return method that returns the total number of occurance of String b in String a
    public static int count (String a, String b){
                               //abab         a
        int count =0; //counts how many time b is appeared in a

        while(a.contains(b)){
            count++;
          a = a.replaceFirst(b,"");
        }

            return count;
    }

    public static void main(String[] args) {

        String str = "abcabc";

       // String str1 = RemoveDup("abcabc"); bu sekilde de yazabilirsin  sout(str1)
        System.out.println(RemoveDup(str));
        System.out.println(count("abab","a"));

    }

}
