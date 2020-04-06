package javaInterviewQuestions;

import java.util.HashSet;

public class FindingDuplicatesInAnArray {

    public static void main(String[] args) {

        String[] names = {"Java", "C", "Python", "Java"};

        boolean flag = false;

        for (int i = 0; i < names.length; i++) {

            for (int j = i + 1; j < names.length; j++) {

                if (names[i] == names[j]) {
                    System.out.println("Found the duplicate element: " + names[i]);
                    flag = true; //as soon as I find the element, I make it true

                }


            }


        }

        if (flag == false) {

            System.out.println("element not found");
        }
        System.out.println(" ");

//hashset

        boolean dups = false;
        String[] str = {"berk", "sevim"};
        HashSet<String> arr = new HashSet<>();

        for (String each : str) {
            if (arr.add(each) == false) {

                System.out.println("found duplicate : " + each);
                dups = true;
            }

        }

        if (dups == false) {

            System.out.println("no dups");
        }

    }


}
