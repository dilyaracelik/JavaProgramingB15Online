package InterfaceRecap_Muhtar;

public interface Interface_VS_AbstractClass {
    int a =10; //final static int
    public abstract void method1();
    public void method2(); //no NEED TO GIVE ABSTRACT KEYWORD!!

    public void method3(); //body vermedigimiz icin instance method olarak gormez!
    public void method4();
}

class Test implements Interface_VS_AbstractClass{


    public  void method1(){
        System.out.println("hello");

    }
    public void method2(){
        System.out.println("ciao");
    }

    public void method3(){
        System.out.println("hola");
    }

    @Override
    public void method4() {
        System.out.println("Selam");
    }



    public static void main(String[] args) {


        System.out.println(a);
    }
    }