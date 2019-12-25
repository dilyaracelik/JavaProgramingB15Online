package studyTime;

import java.util.Arrays;
import java.util.Scanner;

public class Repl141 {
    public static void main(String[] args) {
//        Given an int array, print a new array with double the length where its last
//        element is the same as the original array, and all the other elements are 0. The original array
//        will be length 1 or more. Note: by default, a new int array contains all 0's.
//        Example:
//        input: 4 5 6
//        output: [0, 0, 0, 0, 0, 6]
//
//        Example:
//        input: 0
//        output: [0, 0]
//
//        Example:
//        input: 1 2 3 4
//        output: [0, 0, 0, 0, 0, 0, 0, 4]
//

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE HERE

        int [] newArray = new int [size*2];
        newArray [size*2-1]= nums[size-1]; //newarr size, size1'e assign edilir
        System.out.println(Arrays.toString(newArray));










    }
}
