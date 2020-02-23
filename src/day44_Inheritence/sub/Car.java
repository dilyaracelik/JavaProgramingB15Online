package day44_Inheritence.sub;

import day44_Inheritence.Vehicle;

public class Car extends Vehicle {

int mileage;


    public static void main(String[] args) {

    Car c1 = new Car();

c1.make = "Toyota Corolla";
        System.out.println(c1.make);
        c1.mileage = 233;
        System.out.println(c1.mileage);
        c1.setYear(2022);

        System.out.println("c1.getYear() = " + c1.getYear());



}
}
