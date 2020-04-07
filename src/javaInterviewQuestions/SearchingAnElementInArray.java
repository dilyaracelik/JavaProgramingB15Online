package javaInterviewQuestions;

public class SearchingAnElementInArray {

    //https://www.youtube.com/watch?v=Ze7Yecs49MA&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=21

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

