package OOP_Muhtar;

import javax.imageio.stream.ImageInputStream;

public abstract class Abstraction {

//for generic we can apply abstract like animal, car, not the details!!
    public abstract void startTheCar(); //method without a body
}

class Toyota extends Abstraction {
    @Override
    public void startTheCar() {  //this method is overridden here
        System.out.println("Break");
        System.out.println("Push the start button");
        System.out.println("Release the brake");
    }

    public static void main(String[] args) {

        //  Abstraction obj = new Abstraction() //it doesn't compile since we can't create obj from abstract clas!!
//can not be final


    }

}
class Tesla extends Abstraction{
@Override
    public void startTheCar() {
    System.out.println("Say start");
    System.out.println("start driving");

    }

    public static void main(String[] args) {

    }
}