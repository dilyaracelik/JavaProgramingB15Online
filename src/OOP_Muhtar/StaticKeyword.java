package OOP_Muhtar;

public class StaticKeyword {

   public static String staName = "Nurzat";
    public String insName = "Filiz";


 public static void printName (){

     //   System.out.println(insName); //static onlyaccepts static
        System.out.println(staName);
    }
public void  printName2 (){
    System.out.println(insName);
    System.out.println(staName);

}

}
