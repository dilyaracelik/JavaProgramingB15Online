package day64;
import java.util.*;

public class RepresentingTableData {

    public static void main(String[] args) {


            // for single row
            // i want to get the value by it's column name
            // so i choose Map

            Map<String,String> row1 = new HashMap<>();
            row1.put("first_name", "Regan" );
            row1.put("email", "rboichat0@1688.com" );
            row1.put("gender", "Female" );

            Map<String,String> row2 = new HashMap<>();
            row2.put("first_name", "Carleen" );
            row2.put("email", "cmorillas1@blog.com" );
            row2.put("gender", "Female" );

            // for one row I used one map
            // but I have many rows !
            // may of Some type -->> List<SomeType>


        //    System.out.println(row1);
          //  System.out.println(row2);

            List<Map <String,String>> blabal = new ArrayList<>();
            blabal.add(row1);
            blabal.add(row2);
        System.out.println(row1);
        System.out.println(row2);

        System.out.println(blabal.get(1).get("email"));


    }




}
