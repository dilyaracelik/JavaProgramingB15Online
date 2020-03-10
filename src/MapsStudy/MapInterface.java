package MapsStudy;

import java.util.*;

public class MapInterface {


    /*
    Map<String, String> map = new HashMap<String, String>();
map.get(key) -- retrieves the stored value for a key, or null if that key is not present in the map.

map.put(key, value) -- stores a new key/value pair in the map. Overwrites any existing value for that key.

map.containsKey(key) -- returns true if the key is in the map, false otherwise.

map.remove(key) -- removes the key/value pair for this key if present. Does nothing if the key is not present.
     */


    public static void main(String[] args) {
        Map<String, Double> employees = new HashMap<>();
        employees.put("Sevim", 150.000);
        employees.put("Berk", 500.000);
        employees.put("Picasso", 200.000);

        System.out.println("employees = " + employees);
        System.out.println(employees.get("Berk"));
        employees.remove("Sevim");
        System.out.println("employees = " + employees);
        System.out.println(employees.size());

        System.out.println(employees.containsKey("Berk"));
        System.out.println(employees.containsValue(20.987));
        System.out.println(employees.keySet());
System.out.println("=======================================================================.");
        Map <String,Integer>map1= new LinkedHashMap<>();
        map1.put("A",100);
        map1.put("A",10);
        map1.put("A",9);
        map1.put("A",8);
        map1.put("B",8); //VALUE CAN BE DUPLICATED, KEY CAN'T

        System.out.println("map1 = " + map1);
//=====================================================================
Hashtable<String,Integer>map2 = new Hashtable<>(); //NULL KABUL ETMEZ
//map2.put(null,null); nullpointerexception
        System.out.println("map2 = " + map2);
   //==================================

        TreeMap <String,Integer> map3= new TreeMap<>(); //SORTS ASCENDING
        map3.put("Z",100);
        map3.put("Y",200);
        map3.put("X",400);
        System.out.println("map3 = " + map3);
        
    }
}
