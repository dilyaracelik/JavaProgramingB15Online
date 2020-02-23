package day47_finalKeyword_Abstraction;

public class Rectangle extends Shape {

    //    String name;
//    int area ;
    int width;
    int height;

    public Rectangle(int width, int height) {
        // I want to set the name to word Rectangle;
        // i am reusing the functionality of super class
        // to set the name to rectangle
        super("my rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
}

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle (5, 5);
        System.out.println(r1);
        r1.calculateArea();
        System.out.println("after calculating= "+ r1);
    }
}

