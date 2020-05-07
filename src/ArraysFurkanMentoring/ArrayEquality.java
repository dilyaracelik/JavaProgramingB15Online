package ArraysFurkanMentoring;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {


        int[] arr = new int[5];
        int[] arr2 = {1, 2, 5, 4, 3};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = arr3;
        int arr5[] = Arrays.copyOf(arr3, arr3.length);
        int arr6[] = Arrays.copyOfRange(arr3, 1, 4);

        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));
        //to check if both arrays have  same content
        System.out.println("arr2 and arr3 equals = " + Arrays.equals(arr2, arr3));
        System.out.println("arr3 and arr5 equals = " + Arrays.equals(arr3, arr5));
        //to check if both arrays refers same object
        System.out.println("Is array 3 equal to Array 5 or Array 6 ?  ");
        System.out.println(arr3 == arr5);
        System.out.println(arr3 == arr6);


        System.out.println();
        System.out.println(arr2 == arr3);
        System.out.println(arr3 == arr4);
        arr4[2] = 10;
        System.out.println("After modification for index 2");
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr3 = " + Arrays.toString(arr3));


    }
}
