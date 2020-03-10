package CollectionsFrameworkSelfStudy;

import java.util.*;

public class FIFO_LIFO_Deque {
    public static void main(String[] args) {

        Deque<String> lst = new LinkedList<>();

        lst.add("review the class");
        lst.add("do your homework");
        lst.add("attend the class");
        lst.add("Say bye to Java");

        lst.remove();  //fifo
        System.out.println("lst FIFO= " + lst);

        lst.pop(); //FIFO First in first out
        System.out.println("lst = " + lst);

        lst.removeLast();  //LIFO last in first out
        System.out.println("lst = " + lst);
        


    }
}
