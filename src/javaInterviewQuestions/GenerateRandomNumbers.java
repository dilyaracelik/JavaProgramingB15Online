package javaInterviewQuestions;

import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {


        Random random = new Random();
        int rand = random.nextInt(5);
        System.out.println(rand);


    }
}
