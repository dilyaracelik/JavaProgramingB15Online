package CodinBatMaps1_Solutions;


import java.util.*;

public class MapAB4 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        // map.put("a", "aaa");
        map.put("b", "bbb");
        // map.put("c","cake");
        System.out.println(mapAB4(map));
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {

        int sizeA = map.get("a").length();
      int sizeB = map.get("b").length();


//        if (map.containsKey("a") && (map.containsKey("b"))) {
//            if (map.get("a").length()>map.get("b").length()) {
//                map.put("c", map.get("a"));
//            }
//            if (map.get("a").length()<map.get("b").length()) {
//                map.put("c", map.get("b"));
//            }
//            if (map.get("a").length() == map.get("b").length()) {
//                map.put("a", "");
//                map.put("b", "");
//
//            }
//        }
//        return map;
//    }  }

        if (map.containsKey("a") && (map.containsKey("b"))) {
            if (sizeA > sizeB) {
                map.put("c", map.get("a"));
            }
            if (sizeA < sizeB) {
                map.put("c", map.get("b"));
            }
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");

            }
        }
        return map;
    }  }


//   if (map.containsKey("a") && (map.containsKey("b"))) {
//           if (map.get("a").length() > map.get("b").length()) {
//           map.put("c", map.get("a"));
//           }
//           if (map.get("a").length() < map.get("b").length()) {
//        map.put("c", map.get("b"));
//        }
//        if (map.get("a").length() == map.get("b").length()) {
//        map.put("a", "");
//        map.put("b", "");
//        }
//        }
//        return map;
