package workShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListStudy {
    public static void main(String[] args) {


        Integer [] arr = {1,44,3,12,5};

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        Collections.sort(list);
System.out.println(list);


    }


}
