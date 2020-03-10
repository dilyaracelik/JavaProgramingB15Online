package thingsToRemember;

import java.util.Arrays;
import java.util.Scanner;

public class FindingShortestWordInString {
    public static void main(String[] args) {
        String sentence = "We All Love Java Coding intensively all the time";

        String [] arr = sentence.split(" ");

        String shortest = arr[0];
        for (String each: arr) {
            if (each.length()< shortest.length()){
                shortest=each;
            }

        }

        System.out.println(shortest);


    }}