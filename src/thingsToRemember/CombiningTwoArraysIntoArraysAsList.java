package thingsToRemember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombiningTwoArraysIntoArraysAsList {
    public static void main(String[] args) {

        String[] r1 = {"f", "o", "o"};
        String[] r2 = {" b", "a", "r"};

        List <String> newList = new ArrayList<>(); //add the arrays item inside it
        newList.addAll(Arrays.asList(r1));
        newList.addAll(Arrays.asList(r2));

        System.out.println(newList);

//string convert icin de for loop yapip String str= 0'a stora yapabilirsin!


    }

}
