package CollectionsFrameworkSelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {
        //predicate interface
        //    Predicate <Integer> remove100 = p -> p==100;

        //REMOVEIF
        List<Integer> list1 = new ArrayList<>(Arrays.asList(200, 300, 100, 400, 50, 100));

        list1.removeIf(each -> each == 100);
        System.out.println("list1 = " + list1);


        System.out.println("=======================================================");

        //FOREACH()

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9));
        list2.forEach(each -> {
            if (each < 5) {
                System.out.print(each + " ");
            }
        });


        System.out.println("\n============================");

        list2.forEach(System.out::print);

        System.out.println("========================");

        //task : remove all names Ahmed

        List<String> names = new ArrayList<>(Arrays.asList("Sevim", "Ahmed", "Berk", "Ufuk", "Ahmed"));

        // Predicate <String> removeName = each -> each.equalsIgnoreCase("Ahmed");

        names.removeIf(each -> each.equalsIgnoreCase("Ahmed"));
        System.out.println(names);


        System.out.println("==============================================");
        //task: if name starts with "s" add to the 2nd list and remove from the first list

        List<String> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList("Sevim", "Selin", "Berk", "Ece"));

        List<String> l2 = new ArrayList<>();

        l1.forEach(each -> {
            if (each.startsWith("S")) {
                l2.add(each);
            }
        });
        System.out.println("l2 = " + l2);

        l1.removeIf(each -> each.startsWith("S"));
        System.out.println("l1 = " + l1);


    }

}

