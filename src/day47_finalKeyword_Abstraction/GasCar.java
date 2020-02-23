package day47_finalKeyword_Abstraction;

public class GasCar extends Car {

    int gasLevel;

@Override
    public void start() {
        System.out.println("This is how a gas car starts. ");

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
        // Create another sub class of Car called GasCar
        // add a instance field called gasLevel as int
        // implements all the abstract method of Car class

        // Create GasCar object here
        // call all the methods to test
        GasCar c2 = new GasCar();
        c2.start();
        c2.goBackward();
        c2.goForward();
        c2.turn("Left");

    }

}
