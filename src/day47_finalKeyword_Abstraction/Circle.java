package day47_finalKeyword_Abstraction;

public class Circle extends Shape {


    double radius;


    public Circle(double radius) {
        super("Circle");
        this.radius = radius;

    }

    @Override
    public void calculateArea() {

        area = (int) (radius * radius * Math.PI);

    }


    @Override
    public String toString() {
        return "{ name = " + name + " radius = " + radius + " area = " + area + "}";
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.calculateArea();
        System.out.println(c1);


    }
}