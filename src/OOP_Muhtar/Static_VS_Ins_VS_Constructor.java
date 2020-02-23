package OOP_Muhtar;

public class Static_VS_Ins_VS_Constructor {

    static {
        System.out.println("static block"); //only prints this, it doesn't need an object. Executed as soon as class
        //loaded.Executed 1 time only! Digerleri icin object creation gerekli.

    }


    {

        System.out.println("instance block"); //executed when the object is created, 1 copy for each object
        //runs before constructor

    }
public Static_VS_Ins_VS_Constructor (){

    System.out.println("constructor"); //executed when obj is created, runs after instance block
    //1 copy for each object, number of execution depends on creation of the object
}

    public static void main(String[] args) {

Static_VS_Ins_VS_Constructor obj = new Static_VS_Ins_VS_Constructor();



    }

}