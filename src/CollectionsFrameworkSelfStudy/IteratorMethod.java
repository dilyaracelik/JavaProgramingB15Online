package CollectionsFrameworkSelfStudy;

import java.util.*;

public class IteratorMethod {
    public static void main(String[] args) {

        /*
        Iterator is an INTERFACE from Collection framework. It has 3 core methods: HasNext()-> returns true/false,
        Next()--> returns the next obj,remove()..
        Iterators are used in Java for retrieving the elements one by one, they are used only in Collection Framework.

        In order to remove an item while iterating over a collection, we use remove() method. The advantage: It is
        safe and we don't deal with index.
       */

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        Iterator<Integer> nums2 = nums.iterator();


        while (nums2.hasNext()) {

            if (nums2.next() <= 4)
                nums2.remove();
        }
        System.out.println(nums);

    }
}
