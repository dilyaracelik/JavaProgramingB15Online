package thingsToRemember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LambdaStudy_forEachMethod {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3,5,2,7,9);
nums.forEach( each -> System.out.println("each = " + each) );


ArrayList <String> names = new ArrayList<>(Arrays.asList("Sevim", "Berk", "Ufuk"));
        System.out.println("=================================");
names.forEach (each -> System.out.println("each : "+ each));


Collection <Integer> nums2 = Arrays.asList(23,45,67,89,0);
nums2.forEach(each -> System.out.println("each = " + each));


    }
}
