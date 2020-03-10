package repls;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repl_207_Switch_SwapLastAndFirstArray {
    public static void main(String[] args) {


//        Switch the last element in an array with the first and return the array.
//
//                example:
//
//        do_switch([1,2,3,4])
//        returns:[[4,2,3,1]

        int[] nums = {2, 5, 8, 5, 6};

    }

    public static int[] do_switch(int[] i) {


        int temp = i[0];
        i[0] = i[i.length - 1];
        i[i.length - 1] = temp;
        return i;


    }
}
