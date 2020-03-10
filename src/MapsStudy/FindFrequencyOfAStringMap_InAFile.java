package MapsStudy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FindFrequencyOfAStringMap_InAFile {
    public static void main(String[] args) {

        try {
            List<String> list = Files.readAllLines(Paths.get("src/MapsStudy/mapnote.txt"));
            String str = list.toString();
            Map<String, Integer> map = new LinkedHashMap<>();

            for (String each : str.split(" ")) {
                if (!map.containsKey(each)) {
                    map.put(each, 1);

                } else {
                    map.put(each, map.get(each) + 1);
                }
            }
            System.out.println(map);

        } catch (IOException e) {

            System.out.println("BOOM");
        }

    }
}
