package practice_02_06_Polymorphism;

public class Notes {
    /*Practice Topic: Polymorphisim
    Polymorphisim: ability of the object in many forms
    if the super class/super-type is reference to sub class' (none-abstract) object
    classA  extends  classB
    sub                super
    classA        obj   =     new classA();
    reference     name        object
    classB  obj = new classB();
    classB obj2 = new classA();
    reference type decides what can be called
         if a method is presented in both reference and object class, the overridden one gets executed
    IS A: inherited relation
    Ex: class A extends B
    class Animal{
    }
    class Tiger extends Animal{
    }
    Tiger IS An Animal
    Has A: intsance of the class is used in another class that has no inheritance relationship of
    class Zoo {
        Tiger obj = new Tiger();
    }
    Zoo Has A Tiger
    class extends class only
    class implements interface(s)
    interface extends interface

    if interface/super class is reference, the object must be created from non-abstract sub class
*/
}
