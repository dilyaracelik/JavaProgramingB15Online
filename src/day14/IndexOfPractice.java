package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

        ////            012345678901
        //        String name = "Game of Java" ; // length is 12 , last char index is 11
        //u give the character it gives the location here (charAt tam tersi)

        String name = "Game of Java"; //game of java object
        //Find out the location of Java
        //find the location of letter o
        //find out the location of first space

        System.out.println("Find out the location of Java");
        System.out.println(name.indexOf("Java")); //it gives us 8, why --> location 8'de,
        //o'dan baslar

        System.out.println("find the location of letter o");
        System.out.println(name.indexOf("o")); //yukaridaki cumlede yeri


        System.out.println("find the location of uppercase letter o");
        System.out.println(name.indexOf("0")); //-1 varsa boyle birsey yoktur
        //if location is not found we get - number.

        System.out.println("find out the location of first space");
        System.out.println(name.indexOf(" "));










    }
}
