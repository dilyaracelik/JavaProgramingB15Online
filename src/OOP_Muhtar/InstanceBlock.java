package OOP_Muhtar;

import java.util.Arrays;

public class InstanceBlock {

String[] names = new String[3];

    {
        System.out.println("instance block");
names[0]= "Alla";
names [1] = "Seyfo";
names [2]= "Kursad";


    }
    public InstanceBlock (){
        System.out.println("Constructor");

        names[0]= "Sevim";
        names [1] = "Berk";
        names [2]= "Ufuk";
    }


    public static void main(String[] args) {

      InstanceBlock obj = new InstanceBlock();
        System.out.println("main method");
        System.out.println(Arrays.toString(obj.names));
        InstanceBlock ob2 = new InstanceBlock();

    }

}
