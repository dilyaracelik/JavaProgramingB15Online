package CollectionsFrameworkSelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayListRemoveDuplicatesMethodLinkedHS {

    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 46, 6, 6));

        System.out.println(RemoveDup(nums));

    }

    public static ArrayList<Integer> RemoveDup(ArrayList<Integer> list) {


        LinkedHashSet<Integer> lst = new LinkedHashSet<>(list);

        ArrayList<Integer> result = new ArrayList<>(lst);


        return result;

        //Different Ways

   /*   ArrayList<Integer> result = new ArrayList<>()//;
        for (int i =0; i <list.size() ; i++) {
        if (!result.contains(list.get(i))){
        result.add(list.get(i));
            }

        }
        return result;

       // Alternative way

        for (Integer each: list) {
        if (!result.contains(each) )
            result.add(each);

        return result; */

    }


}
