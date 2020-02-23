package day49;

public class AbstractionNotesOfficeHour {
//    Topic:  Abstraction
//    Abstract methods
//    Abstract class
//    abstract class VS Non-Abstract class
//    Abstraction: concentrating on importance/essential things without worrying about the details
//    We have 2 ways to achieve abstraction:
//
//            1-way : abstract class:
//
//    keyword: abstract
//           1. we cannot create object of
//
//           2. it's a class that's meant to be extended
//           3. cannot be final
//           4. class' access modifiers can only public or default
//
//
//    abstract method: 1.a method that's MEANT to be override
//            2.a method without body/implementation, hides the implementation details
//                   3.cannot be static, private, final
//                   4.Only the instance method can be override
//==>An abstract class has no use until unless it is extended by some other class.
//            => Concrete class MUST override all abstract methods that are inherited from abstract parent class.
//            => Can abstract class have ONLY non-abstract methods?
//            - Yes.
//=> The Child class that is extending to the abstract class is called Concrete class.
//    Ex: Cat and Dog are concrete classes.
//            => Can we instantiate abstract class(Can we create object) if we don't have any abstract method in it?
//            - NO.
//=> Can abstract class override methods?
//            - Yes. Because abstract classes can have a methods with body/implementation as well.
//=> How can we have a class that doesn't have a child?
//            - final.
//            => Can abstract classes be final?
//            - No.
//=> Can abstract method be final?
//            - No.
//==>Why can’t we create the object of an abstract class?
//    Because these classes are incomplete, they have abstract methods that have no body
//    so if java allows you to create object of this class then if someone calls the abstract method
//    using that object then What would happen?
//            ==>Does abstract class have a constructor?
//            - Yes. Constructor of abstract is NOT used to create an object.
//    Because it is abstract class.
//    BUT it will help us to reach full inheritance process. It helps Java to reach to Object class.
//            2-way: Interface
//    An interface in Java is basically a way of specifying what methods a class should have
//            Have Abstract method ONLY
//            After java 8, there are static and default methods are added as well.
//==>What we can have in Interface ?
//    methods: Abstract methods, static methods, default method
//    variables:  public static final ==> automatically variables are public, static and final by default
//    EX: public static final String ZOO_NAME = "CyberZoo";
//==>What we cannot have in Interface?
//    Constructor
//    Instance methods
//    instance variable
//    instance block
//    static block
//


}
