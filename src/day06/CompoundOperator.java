package day06;

public class CompoundOperator {
    public static void main(String[] args) {



//assignment operator = ---> will save the result of
//whatever operation on the right side and assign the results to the left side variable

//= assignment operator
//you can change the value of the same variable and can use it again and again.
// last assigned value counts.


    int studentOnline = 263;
   studentOnline = studentOnline + 5;
   System.out.println( "5 people joined the class: " +  studentOnline);


   studentOnline = studentOnline - 3;
   System.out.println( "3 people left the class: " +  studentOnline);

// studentOnline =studentOnline + studentOnline; boyle de olur
   studentOnline = studentOnline*2;
   System.out.println("The student count doubled: " +  studentOnline);

   studentOnline = studentOnline/3;
   System.out.println ("Student count dropped to 1/3: " + studentOnline);






    }


}
