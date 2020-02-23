package day47_finalKeyword_Abstraction;

public class ElectricCar extends Car {
@Override
public void start() {
        System.out.println("This is how an electric car starts. ");
        }

@Override
public void goForward() {
        System.out.println("GOING FORWARD!");
        }

@Override
public void goBackward() {
        System.out.println("GOING BACKWARD!");
        }

@Override
public void turn(String direction) {
        System.out.println("TURNING " + direction + "!");
        }




    public static void main(String[] args) {


        // Abstract class can not be instantiated
        // It means we can not create object out of it
//        Car c = new Car();

        ElectricCar c1 = new ElectricCar();
        c1.start();
        c1.goBackward();
        c1.goForward();
        c1.turn("Right");
    }}