package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class HW1_removeTheLastCommaInsertNumsBetweenArraylist {
    public static void main(String[] args) {


        ArrayList<Integer> insert100 = new ArrayList<>(Arrays.asList(1, 3, 7, 2, 12, 7));
        insertHundreds(insert100);

    }

    public static void insertHundreds(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i%2==1){
                numbers.add(i,100);
            }
        }
        System.out.println(numbers);

    }
}