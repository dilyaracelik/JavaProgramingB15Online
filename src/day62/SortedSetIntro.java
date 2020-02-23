package day62;

import java.util.*;

//tell me about difference between hashSet linkedHashSet and treeSet ?
//does not have duplicate hashSet
//everything sorted duplicates removed treeSet
//no duplicates + insertion order LinkedHashSet


public class SortedSetIntro {

    public static void main(String[] args) {

        // SortedSet interface extends Set interface
        // it is a data structure that store unique elements in sorted order
        // The implementing class is TreeSet

        SortedSet<Integer> mySet = new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);

        System.out.println("mySet = " + mySet);
        // There are few extra method available in sorted set because it's already sorted
        System.out.println("mySet.first() = " + mySet.first());
        System.out.println("mySet.last() = " + mySet.last());


        }

        }