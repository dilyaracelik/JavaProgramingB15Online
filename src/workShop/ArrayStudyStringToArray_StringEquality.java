package workShop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudyStringToArray_StringEquality {
    public static void main(String[] args) {


        int[] nums1 = {1, 2, 3, 45, 4, 4, 4, 2, 1, 3};


        for (int j = 0; j < nums1.length; j++) {
            int count1 = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] == nums1[j]) {
                    count1++;
                }

            }
            if (count1 == 1) {
                System.out.println(nums1[j]);
            }
        }


        int[][] lst = {{1, 23}, {2, 7}, {4, 5, 6}};
        for (int i = 0; i < lst.length; i++) {
            for (int j = 0; j < lst[i].length; j++) {
                System.out.print(lst[i][j] + " ");
            }
        }

        System.out.println("====================== ");

        char[][] ch = {{'r', 'u'}, {'p', 'o'}};
        for (int j = 0; j < ch.length; j++) {
            for (int k = 0; k < ch[j].length; k++) {
                System.out.print(ch[j][k] + " ");

            }
        }

        System.out.println("=============== String Array Conversion ");
        String a1 = "ayc";
        String a2 = "esd";

        char[] c1 = a1.toCharArray();
        Arrays.sort(c1);
        System.out.println(Arrays.toString(c1));

        char[] c2 = a2.toCharArray();
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c2));

        if (c1.equals(c2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
