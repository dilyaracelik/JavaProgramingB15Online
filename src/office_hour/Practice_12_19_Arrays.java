package office_hour;

import java.util.Arrays;

public class Practice_12_19_Arrays {
    public static void main(String[] args) {

            int a = 'A';
            int[] arr = {10, (byte) 9, (short) 8, 'a'}; // data MUST match with the data type	of the array
            System.out.println(Arrays.toString(arr));

            long l1 = 100;  // implicit: by default 100 is an integer, and we assign it to long data type
            int num1 = (int) l1;  // explicit

            System.out.println(arr[arr.length - 1]);  // data at last index: 97

            int[] arr2 = {0, 0, 0};
            for (int each : arr2) {
                System.out.println(each); // 0  0  0
            }

            System.out.println("================================");
            for (int i = 0; i < 4; i++) {

                System.out.println(i);

                if (i == 2)
                    continue;

                System.out.println(i + " is printed");

            }
            System.out.println("================================");

            for (int i = 0; i < 4; i++) {

                System.out.println(i); //0  1  2

                if (i == 2) {
                    break;  // exits the loop IMMEDIETLY
                }

                //    System.out.println(i); //0 1

            }


        }}

