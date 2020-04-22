package BootCamp;

import javax.imageio.stream.ImageInputStream;

public class Task {

/*
Create a method that will take 2 parameters as
a numbers and prints which number is larger.



 */


    public void findLarger(int a, int b) {

        if (a > b) {

            System.out.println(a + " is larger than " + b);

        } else if (b > a) {


            System.out.println(b + " is larger than " + a);
        } else {

            System.out.println(a + " is equal to " + b);


        }
    }

    public static void main(String[] args) {


        Task obj = new Task();
        obj.findLarger(16, 5);


    }

}



