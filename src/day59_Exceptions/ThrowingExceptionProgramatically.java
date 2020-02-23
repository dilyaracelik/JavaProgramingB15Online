package day59_Exceptions;

public class ThrowingExceptionProgramatically {

    public static void main(String[] args) {


        NullPointerException e1 = new NullPointerException("back to earth");
        System.out.println(e1.getMessage());
        throw new NullPointerException("back to earth");
    }
}
