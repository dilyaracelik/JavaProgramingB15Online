package javaInterviewQuestions;

import java.util.Arrays;

public class CheckTwoArraysEquality {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 35, 6};
        int[] arr2 = {1, 2, 35, 6};

        boolean status = Arrays.equals(arr1, arr2);

        if (status == true) {

            System.out.println("2 arrays are equals.");
        } else {
            System.out.println("2 arrays aren't equals.");


        }
    }
}
