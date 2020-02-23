package Practice_02_13_Exception;
//throws keyword:
// advantage ;
//reading code is easier
//if we have lots of error, using too many try-catch can be confusing
// by using just one throws keyword we can run the code
//disadvantage:
//It is not handling the exception; it is escaping temporarily
// the caller of the method will be responsible for dealing the exception
public class ExceptionsPracticeThrowsKeyword  {

    public static void main(String[] args) throws Exception {
        System.out.println("Step 1");

        Thread.sleep(4000);

        System.out.println("Step 3");

        System.out.println("Step 4");

        Thread.sleep(4000);

        System.out.println("Step 5");

    }

    public static void method1() throws Exception {


        main(new String[]{"A"});

    }

    public static void method2() {
        try {
            method1();
        } catch (Exception e) {

        }
    }

    public static void method3() {

        // method2();

    }


}