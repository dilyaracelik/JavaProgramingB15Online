package day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {

    public static void main(String[] args) {


        Queue<String> task = new LinkedList<>();
        task.add("review the class");
        task.add("do HW");
        task.add("study etc");
        task.remove();
        System.out.println("task = " + task);

    }



}
