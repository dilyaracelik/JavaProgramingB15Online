package repls;

public class Repl180 {
    public static void main(String[] args) {


//        Your job is to write an important code that will :
//
//        - to search and find each appearance of coverME within main
//                - then surround it with [coverMe] (square brackets)
//        - if you cannot find the coverME within main after tirelessly
//        looping then just return whole main itself covered [main].
//                - keep in mind that coverME value can be of any length.
//
//        Examples:
//        coverString("java methods", "me") ) ; ==> "java [me]thods"
//
//        coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
//
//        coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
//
//        coverString("apples", "pears") ) ; ==> "[apples]"


        String main = "hello hello";
        String coverMe = "ello";

//        String result = "";
//        String newCoverm = "[" + coverMe.substring(0, coverMe.length()) + "]";
//        if (main.contains(coverMe)) {
//            result = main.replace(coverMe, newCoverm);
//            System.out.println(result);
//

    }


    public static String coverString(String main, String coverME) {

        String result = "";
        String newCover = "[" + coverME.substring(0, coverME.length()) + "]";
        if (main.contains(coverME)) {
            result = main.replace(coverME, newCover);

            return result;
        }
          return "["+main+ "]";
      }


}
