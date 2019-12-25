package day15;

public class NameChecker {
    public static void main(String[] args) {

//        Task 1 :
//        Name checker :
//        Declare a variable to store your name
//        check whether you name length is less than 4
//        if so print short Name
//        if it is within 5-10
//        if so print medium Name
//        if it's more than 11
//        print longer name
//                ------------------------------
//        check whether your name has either character a or e
//        if so -->> name contains a or e
//        if not -->> i dont have both a or e in my name


        String name = "Sevim";

        if (name.length()<4) {
            System.out.println("Short name.");
        }else if (name.length()>5 && name.length()<10) {
            System.out.println("Medium name");}
     else if(name.length()>11) {
        System.out.println("Longer name.");
    }

//-------------------------------
     if (name.contains("a") || (name.contains("e"))) {
            System.out.println("Name contains a or e." );
        } else {
            System.out.println("I don't have both a or e in my name."); }








    }
}
