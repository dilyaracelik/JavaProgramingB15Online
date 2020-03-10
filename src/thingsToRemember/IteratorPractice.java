package thingsToRemember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
//        -- Iterator -- see it as a tool to iterate over a collection
//        -- with basic functionality
//
//        in order to get an Iterator object we can call the method

    // 3 methods available : hasNext() , next() , remove


    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>(Arrays.asList(20, 10, 44, 3, 11));
        Iterator<Integer> numIter = lst.iterator();

        while (numIter.hasNext()) {
            int x = numIter.next();
            if (x > 10)
                System.out.println(x);

        }


    }
}
