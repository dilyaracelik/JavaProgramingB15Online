package day47_finalKeyword_Abstraction;

public class Triangle extends Shape {

    int height;
    int base;

    public Triangle(int height, int base) {
        super("Triangle");
        this.height = height;
        this.base = base;

    }

    @Override
    public void calculateArea() {
        area = height * base / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle (5, 5);
        System.out.println(t1);
        t1.calculateArea();
        System.out.println("after calculating= "+ t1);
    }
}

