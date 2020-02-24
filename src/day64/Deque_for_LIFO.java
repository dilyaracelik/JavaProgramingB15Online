package day64;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        Deque<String> task = new LinkedList<>();
        task.add("review the class");
        task.add("do HW");
        task.add("study etc");
        System.out.println(task.removeFirst());



    }
}
