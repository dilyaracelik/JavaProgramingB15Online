package CollectionsFrameworkSelfStudy;

import java.util.*;

public class CollectionsFrameworksListSet {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        System.out.println(list);

        String[] str = {"A", "B", "C"};
        LinkedList<String> strList = new LinkedList<>(Arrays.asList(str));
        System.out.println(strList);
        Vector<Integer> v1 = new Vector<>();
        v1.add(20);
        System.out.println("v1 = " + v1);

        System.out.println("=========================");

        Stack<Integer> st = new Stack<>();
        st.add(5);
        st.push(6);
        st.add(2);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);


        System.out.println("=============");

        Set<Integer> s1 = new HashSet<>();
        s1.add(100);
        s1.add(3);
        s1.add(3);
        System.out.println(s1); //3 just once, set doesnt accept duplicates!!

        System.out.println("===================");
        Set<Integer> hashset = new HashSet<>();
        hashset.add(12);
        hashset.add(3);
        hashset.add(7);
        hashset.add(3);
        System.out.println(hashset);

        Set<Integer> hashset1 = new LinkedHashSet<>();  //prints in an order, doublly linked
        hashset1.add(13);
        hashset1.add(5);
        hashset1.add(13);
        hashset1.add(20);
        System.out.println(hashset1);

        Iterator<Integer> asd = hashset1.iterator();
        System.out.println(asd.hasNext());
        System.out.println(asd.next());
        asd.remove();

        System.out.println("TREESET========================");

        SortedSet<String> str2 = new TreeSet<>();
        str2.add("Z");
        str2.add("Y");
        str2.add("X");
        str2.add("W");
        System.out.println(str2);


    }
}
