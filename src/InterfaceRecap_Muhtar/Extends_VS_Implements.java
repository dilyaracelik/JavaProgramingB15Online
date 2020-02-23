package InterfaceRecap_Muhtar;


interface B {

    void method3();


}


public interface Extends_VS_Implements extends B{
                   //subtype                  supertype

    void method1(); //public by default
    void method2(); //public
//   void method3();


}
class A implements Interface_VS_AbstractClass {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
/*
    void method1();

    void method2();
*/

}
class C extends A implements B, Extends_VS_Implements{


}