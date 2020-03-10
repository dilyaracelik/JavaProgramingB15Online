package workShop;

import java.io.IOException;

public class WarmUp_ThreadSleepMethod {

    public static void main(String[] args) {


        Wait(2);
    }


    public static void Wait(double seconds) {

        try {

            Thread.sleep((long) (seconds * 1000));
            System.out.println("try block");
        } catch (Exception a) {
            System.out.println("catch block");

        }

    }
}