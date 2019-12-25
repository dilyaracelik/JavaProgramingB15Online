package day13;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Berk";
        System.out.println(name);

      //  name = "Sevim";
        //System.out.println(name); //For the object time it doesn't store the
        //object directly. 2 cevap cikar. Int de farkli, degistirir.
    //stack'de iki
        name.toUpperCase(); //bu cevirmiyor, no remote
        System.out.println(name);
//everytime a new string is created
        System.out.println(name.toUpperCase());  //bu ceviriyor

//what if I really want to change the name
//we need to have the control
  name =name.toUpperCase();
        System.out.println(name.toUpperCase());

//STRING IS IMMUTABLE.ONCE CREATED IT CAN NOT BE CHANGED.
//ANY STRING ACTIONS/METHODS THAT LOOKS LIKE CHANGING THE VARIABLE
//actually creating a new String object






    }
}
