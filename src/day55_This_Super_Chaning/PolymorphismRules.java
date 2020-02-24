package day55_This_Super_Chaning;

public class PolymorphismRules {
    //                UP - CASTING
// object behavior in many forms - is polymorphism
// it only occurs betw parent and child class.
//  how to create object; object MUST BE created from NON - ABSTRACT class
    //      classA    obj       =         new classA
//      re.type    ref.name          object
//             IMPORTANT RULES:
//   1)  reference type decides what is accessible and what can be used
//  2)  ref.type CAN BE PARENT CLASS OR INTERFACE, AND OBJECT CAN BE ANY SUB- CLASS
//                POLYMORPHISM :
    // IT OCCURS when the super class is reference type, and object is
    //  created from the classes that have IS A Relation with the super class / interface.
//   Animal class is reference and we make object from tiger and octopus.
//=============================================================================================
//  EX:
//    WebDriver driver = new ChromeDriver();
//       driver.get ("google.com") --- this was overriden by ChromeDriver and it will be executed.
//  this get method will open ChromeDriver
//    WebDriver driver = new FireFoxDriver();   //  WebDriver is interface
//   driver.get("google.com");
// this get exists in reference type so we can call it.
// it will open FireFoxDriver because FireFoxDriver implements WebDriver.
// the overridden should be executed
//===============================================================================================
//  Is A relation: occurs betw inherited class; for ex: class Dog extends Animal
    //  class Husky extends DOG
    //  DOG is An Animal
    //  Husky is A Dog
//  Husky is an Animal
/*
Definition of HAS A RELATIONSHIP
instance of the class (object) is used in another classes
EX:
class Car{
    Engine obj = new Engine();
}
Car has an engine
class Zoo {
     Tiger obj1 = new Tiger();   //  So there is no inheritence relationship
     Octopus obj2 = new Octopus();
     Animal obj3 = new Tiger();
     }
     Zoo HAS A Tiger
     Zoo HAS An Octopus
     Zoo HAS an Animal
     Tiger is An Animal
    Animals obj = new Husky();
 */

}