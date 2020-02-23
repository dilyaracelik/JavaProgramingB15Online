package homeworks.upCasting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    List<Product> productLst;
    public Store() {

        productLst = new ArrayList<>();
    }
    public Store(List<Product> productLst) {
        this();
        this.productLst.addAll(productLst);
    }
    @Override
    public String toString() {
        return "Store{" +
                "productLst=" + productLst +
                '}';
    }
    public void addProduct(Product p) {
        productLst.add(p);
    }
    public void removeProduct(Product p) {
        productLst.remove(p);
    }


    public void checkIfProductExist(Product p) {
        for (Product each: productLst) {
            if(each.equals(p)){
                removeProduct(p);
            }
        }

    }
    public double maxPrice() {
        double max = Double.MIN_VALUE;
        for (Product each : productLst) {
            if (max < each.getPrice()) {
                max = each.getPrice();
            }
        }
        return max;
    }
    public double sumOfItems() {
        double sum = 0;
        for (Product each : productLst) {
            sum += each.getPrice();
        }
        return sum;
    }
}