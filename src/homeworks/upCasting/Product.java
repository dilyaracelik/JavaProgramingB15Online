package homeworks.upCasting;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
//
    @Override
    public boolean equals (Object obj) {

        Product otherProduct = (Product) obj;
        return this.name.equals(otherProduct.name) && this.price == otherProduct.price;
    }

    public boolean equals (Product otherProduct){

        return this.name.equals(otherProduct.name) && this.price == otherProduct.price;
        //not sure about this
        //Two products should be equal if they have the same fields value.
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }





}
