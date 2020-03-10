package CollectionsFrameworkSelfStudy;

import java.util.*;

public class RemovingDuplicatesAndSortAnArrayWithTreeSetLinkedHashSet {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 2, 0, 2, 9, 3, 3));

        TreeSet<Integer> treeset = new TreeSet<>(list);
        System.out.println(treeset);  //removes duplicates, and sort!!!!!

        System.out.println("===================================");

        String str = "ZZAAABBBCCCDD"; //Remove the duplicates, Order them
        //str= new TreeSet<String>(Arrays.asList(str.split(""))).toString();

        String[] strList = str.split(""); //we convert String to an Array

        TreeSet<String> treeList = new TreeSet<>(Arrays.asList(strList));  //sort yapip, duplicateleri cikardi

        String result = treeList.toString().replace("[", "") //stringe cevirdik
                .replace("]", "").replace(",", "").replace(" ", "");
        System.out.println("result = " + result);

        System.out.println("=================");

        //remove the duplicates, keep the order, don't sort
        //LinkedHashSet kullaniriz, orderi degistirez ve removes duplicates, hashset order degistirir

        String str1 = "ZZAXXAACCCDD";

        String[] strListt = str1.split("");
        LinkedHashSet<String> linkkk = new LinkedHashSet<>(Arrays.asList(strListt));
        String poff = linkkk.toString().replace("[", "").replace("]", "")
                .replace(",", "").replace(" ", "");
        System.out.println(poff);
        System.out.println("================================== ");
        str1 = new LinkedHashSet<String>(Arrays.asList(str1.split(""))).toString();//kisa yol, stringe cevirmeden
        System.out.println(str1);

    }

}
