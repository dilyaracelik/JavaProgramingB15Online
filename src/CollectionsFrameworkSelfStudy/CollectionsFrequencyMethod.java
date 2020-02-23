package CollectionsFrameworkSelfStudy;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsFrequencyMethod {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        System.out.println(Collections.frequency(list, 30));

    }
}
