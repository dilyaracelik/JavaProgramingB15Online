package office_hour;

import day37.ArrayList_AsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice_20_01_09ArrayList {
    public static void main(String[] args) {

        int[] arr = new int[5];
        List<Integer> list = new ArrayList<>();
        list.add(10); //autoboxing bec num is int ArrayList only accept objects   10
        list.add(20);//autoboxing 10,20
        list.add(1, 30); //10,30,20
        System.out.println(list.size());

        list.get(1);
        int num = list.get(1); //unboxing
        System.out.println("num = " + num);


        list.clear();  // empty olur []

        System.out.println(list.size()); //0

        ArrayList<String> lst2 = new ArrayList<>();

        lst2.add("A");
        lst2.set(0, "B");
        lst2.contains("C");
        // we can assign boolean value
        boolean result = lst2.contains("C");
        System.out.println(result);

        System.out.println(lst2.isEmpty());

        System.out.println(lst2.indexOf("B")); //returns 0 as primitive int
        System.out.println(lst2.indexOf("D")); //-1 because it is no exist in the ArrayList

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        // [1,2,3]

        // int a1= 1 ;
        Integer a2 = 1;
        //list3.remove(a1); // [1,3]
        boolean r1 = list3.remove(a2);  // [2, 3]
        System.out.println(list3);
        System.out.println(r1); // true, 1 was removed from the arraylist
        List<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");
        //      [A, B, C, D]
        // list4.remove(2); //[A, B, D]
        list4.remove("B"); //[A, C, D]
        System.out.println(list4);
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> list5 = Arrays.asList(nums);
        System.out.println(list5);
        String[] students = {"Nursultan", "Irina", "Dilshat", "Roksana"};
        List<String> names = new ArrayList<>(Arrays.asList(students));
        //  names.addAll(  Arrays.asList(students) );
        names.addAll(Arrays.asList("Mohammad", "Bulent", "Mustafa"));
        System.out.println(names);
        List<String> grades = new ArrayList<>();
        grades.addAll(Arrays.asList("A", "B", "A", "C", "D", "E", "F"));
        grades.removeAll(Arrays.asList("A", "C"));
        System.out.println(grades); //[B, D, E, F]
        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Corolla", "BMW", "Jaguar", "Honda", "Tesla", "BMW"));
        // remove all the cras that are not BMW, or Jaguar, or Tesla
        cars.retainAll(Arrays.asList("BMW", "Jaguar", "Tesla"));
        System.out.println(cars);
      /*
      give name list: Ahmet, John, Ahmet, Eric, Aaron
       */
        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet", "Eric", "Ahmet", "John", "Aaron", "Ahmet"));
        System.out.println(employees);
        employees.removeAll(Arrays.asList("Ahmet"));
        System.out.println(employees);
        List<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmet", "Eric", "Ahmet", "John", "Aaron", "Ahmet"));
        employees2.retainAll(Arrays.asList("Ahmet"));
        System.out.println(employees2);
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        Collections.sort(nums2);
        System.out.println(nums2);
    }
}





