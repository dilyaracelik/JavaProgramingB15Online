package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListConversion {
    public static void main(String[] args) {

        Integer[] nums = new Integer[] {1,4,5,7,8,5,3,2,19} ;
        List<Integer> numsLst = Arrays.asList(new Integer[12]);
        Integer[] numsArr = numsLst.toArray(new Integer[12]);


        String[] arr={"elma", "armut","vs"};
        List<String> arrList= new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrList);
        arr[0] = "portakal";
        arrList.set(1,"nar");
        arrList.add("kelmahmut");
        System.out.println(arrList);
        System.out.println(Arrays.toString(arr));



    }
}
