package day47_finalKeyword_Abstraction;

public class Square extends Shape {

    int side;

    public Square(int side) {
        super("Square");
        this.side=side;
    }
@Override
    public void calculateArea() {
    area = side*side;

    }

    public String toString() {

        return "{ name = " + name + " side = " + side + " area = " + area + "}";

    }

    public static void main(String[] args) {

Square s1 = new Square( 5);

     s1.calculateArea();
        System.out.println(s1.toString());


    }
    }
