package OOP_Muhtar;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

    static String[] arr = new String[3];
    static ArrayList <String> list = new ArrayList<>();
double slary = 100000;
   static {
        //we use static block to initialize static variables.
        System.out.println("Static block");

        arr[0]= "Alla";
        arr[1]= "Katerna";
        arr[2]="Rulamn";

        list.addAll(Arrays.asList(arr));

    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(Arrays.toString(arr));
        System.out.println(list);


    }

}
