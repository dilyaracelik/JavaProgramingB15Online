package office_hour;

import java.util.Arrays;

public class Practice_12_10_Arrays {
    public static void main(String[] args) {
        String [] cars = {"bmw","wv","audi"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
//for each loop
       //temporary variable: array name
        for (String carModels : cars) {
            System.out.println("car models are " + carModels);
        }
         int [] ages ={23,13,19,25,4};

        System.out.println(ages[3] - ages[0]);

for (int eachAge: ages) {
    System.out.println("ages of sts are" + eachAge);
}
        System.out.println(Arrays.toString(ages));


    }
}

