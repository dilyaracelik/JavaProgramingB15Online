package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        //char grade = 'B';
        //System.out.println(grade);


        //B is represented by 66 in ascii table
        //here type char is automatically widen to int
        //and stored as number
        //int letterInNumber = 'B';
        //System.out.println(letterInNumber);

        //int letterInNumber2 = 'b';
        //System.out.println(letterInNumber2);
//---------------------------------------------------
        //char myFirstChar = (char) 100; //saving the number
        // as char so we can get the character representation
        //of the number in ascii table
        //  System.out.println(myFirstChar);
// ------------------------------------------
//find out your number of each character in your first name

        int myNameS = 'S';
        System.out.println(myNameS);
        int myNameE = 'E';
        System.out.println(myNameE);
        int myNameV = 'V';
        System.out.println(myNameV);
        int myNameI = 'I';
        System.out.println(myNameI);
        int myNameM = 'M';
        System.out.println(myNameM);
        //------------------


        ///another way, example, optional part
        char letterA ='a';
        //adding a character to an int number will result in int
        //(int) letterA + 1
        System.out.println (letterA + 1); //sonuc 98 oldu

        System.out.println (" " + letterA + 1); //string oldugu icin hepsi string olur " " -->string

       //string + any data type it becomes string




    }

}
