package CollectionsFrameworkSelfStudy;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetArrayDuplicatesRemovalConvertString {
    public static void main(String[] args) {

        //LinkedHashSet is a class that implements Set interface
        //doesn't change the order, removes the duplicates
        //doublly linked

        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};

        LinkedHashSet <Integer> list = new LinkedHashSet<>(Arrays.asList(numbers));

        //optionally converted to String

        String str = list.toString().replace("[","").replace("]","");
        System.out.println("str = " + str);
      

    }
}
