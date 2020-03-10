package thingsToRemember;

import java.util.Arrays;

public class ArrayMethodForLoopMultiplication10 {
    public static void main(String[] args) {

        double arr[] ={1.0,2.0,3.0,4.0,5.0};
        arr = timesTen(arr);
      for(double each:arr) //for loop ile her bir karakteri parantez olmadan yazdiriyor
          System.out.println(each);

    }

    public static double[] timesTen(double[] arr)
    {
        for(int i =0; i<arr.length; i++){

            arr[i] *=10;

        }
        return arr;

    }

}
