package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_12_10_ArrayPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter language: ");

        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();
       String [] languages = {l1,l2,l3};
        System.out.println("You entered :" + languages[2]);

        System.out.println(Arrays.toString(languages));

        for (String lan : languages) {
            System.out.println(lan);
for (int x = 2; x >=0; x-- ) {

    System.out.println(languages[x]);
}
        }
    }
}
