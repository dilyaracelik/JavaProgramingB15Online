package CollectionsFrameworkSelfStudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseAndSortMethod {

    public static void main(String[] args) {

        String[] names= {"John", "Lila", "Pablo"};
        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));

        Collections.reverse(newNames);
        System.out.println("newNames = " + newNames);

        //Sorting a List

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 2, 3, 46, 6));
        Collections.sort(nums);
        System.out.println("nums sorted= " + nums);

        // Sorting and reversing a List

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("nums sorted and reversed = " + nums);

    }
}