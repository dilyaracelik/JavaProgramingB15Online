package day58;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws Exception{

        Thread.sleep(1000);


        try {

            Thread.sleep(1000);
            System.out.println("checked");
        }catch (Exception e){

            System.out.println("unchecked");
        }

    }



}
