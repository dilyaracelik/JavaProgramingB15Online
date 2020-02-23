package OOP_Muhtar;

class Holly {

   final public void printName (){
        System.out.println("Sevim");
//final eklersek override yapamayiz
 //constant, it makes immutable, can't be changed
    }

}



public class FinalKeyword extends Holly {


    //overriding is used for changing functionality, used for instance methods only
  //  @Override
//    public void printName (){   //this doesn't compile since we used final keyword
//
//        System.out.println("Berk");
//    }
//


    final int age = 18;




    //final keyword constant, can't be changed or modifible
    //can only be apply to variables, methods, classes.
    //if variable is final, we can't reassign it.
    //instance and static variables must be assigned immediately if we assign final word.
//before using we can assign in local variables with final keyword.

    public static void main(String[] args) {
        final String SSN = "123456";  //LOCAL VARIABLE declared as final
        //  SSN = "23143534"; this doesn't work, since we used final. constant!
        System.out.println(SSN);

        final String DateOfBirth; //local variable, we need to assign it

        FinalKeyword obj = new FinalKeyword();
        System.out.println(obj.age);


    }


}
