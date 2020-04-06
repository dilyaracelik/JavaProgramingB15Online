package javaInterviewQuestions;

public class SearchingAnElementInArray {

    public static void main(String[] args) {

        int[] arr = {2, 2, 34, 56, 6};
        int num = 6;

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {

            if (num == arr[i]) {
                System.out.println("element found: " + arr[i]);
                flag = true;
                break;

            }

        }

        if (flag == false) {

            System.out.println("element not found");
        }


    }


}
