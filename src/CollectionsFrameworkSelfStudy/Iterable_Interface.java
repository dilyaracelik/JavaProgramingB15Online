package CollectionsFrameworkSelfStudy;

import java.util.*;

public class Iterable_Interface {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 1, 2, 3, 4, 5, 6, 7));

//lambda way
//        list.removeIf(num -> num == 1);
//        System.out.println(list);

        Iterator<Integer> list1 = list.iterator();

        while (list1.hasNext()) {
            int num = list1.next();
            if (num == 1)
                list1.remove();

        }
        System.out.println("=========================");

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(10, 20));

        Iterator<Integer> iterate = set.iterator();
        while (iterate.hasNext()) {
            iterate.next();
        }
        System.out.println(set);

        System.out.println("=================");
        //removes the names that contains "e", equalsignore

        Set<String> names = new LinkedHashSet<>(Arrays.asList("Sevim", "Erhan", "Nadire", "Tarbiz"));

        Iterator<String> namesIt = names.iterator();

        while (namesIt.hasNext()) {
            if (namesIt.next().toLowerCase().contains("e")) { //hepsini lower case yap ve oyle check!
                namesIt.remove();
            }

        }
        System.out.println(names);

    }}
