package day12;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CheckingStringEqualityWithoutCase {
    public static void main(String[] args) {
/* String userName = "aBc123" ;
         boolean userNameCorrect = userName.equals("ABC123");
        System.out.println(  userNameCorrect );
        boolean  nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
        System.out.println(  nameCheckIgnoreCase );*/



//String name = "Sevim";

   //boolean userNameCorrect = name.equals("Sevim");
  // System.out.println(userNameCorrect);
  //boolean nameCheckIgnoreCase =name.equalsIgnoreCase("SEVIM");

  //System.out.println(nameCheckIgnoreCase);

//TEACHER'S WAY
        // store your name is a name variable
        // check for equality using different uppercase lowercase example
        // using equals and equalsIgnoreCase

        String name = "Emre";
        // I want to store the result of checking name into a variable
        boolean nameEqualsWithoutCase = name.equalsIgnoreCase("emre");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);

        System.out.println(name.equalsIgnoreCase("eMrE"));








    }
}
