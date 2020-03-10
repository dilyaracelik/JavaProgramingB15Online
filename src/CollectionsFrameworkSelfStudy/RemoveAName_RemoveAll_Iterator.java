package CollectionsFrameworkSelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveAName_RemoveAll_Iterator {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
//First way:
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

//Second way:
        Iterator<String> newNames = names.iterator();

        while (newNames.hasNext()) {
            if (newNames.next().equals("Ahmed"))
                newNames.remove();

        }
        System.out.println(names);
    }
}