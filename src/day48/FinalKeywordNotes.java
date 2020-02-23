package day48;

public class FinalKeywordNotes {
  /*  FINAL KEYWORD
    the final keyword is associated with inheritance.
    final Class:
    A final class can not be extended (can not be inherited) by a subclass.
            Example:

    String Class is a "final" class
    Public Class SomeWord extends String {  <-- This will throw a compiler error
    }
    final Method:
    final methods can be inherited, they just can not be overridden (but it can be OVERLOADED).
    final Variable:
    the final keyword, when used with variables, makes the variable unchangeable. You are not allowed to reassign a value.
    Example:
    public class FinalVariablesPractice {
        public static void main(String[] args) {
            int x = 10;
            x = 100;  <-- normal variables can be changed as much as you like.
            final int a = 20 ;
            a = 200;  <----- THIS WILL THROW AN ERROR!
        }
    }
    When used on Object variables, the final keyword prevents the object AT THE HEAP ADDRESS from being reassigned. (the address does not change anyways)
    Collapse
*/
}

