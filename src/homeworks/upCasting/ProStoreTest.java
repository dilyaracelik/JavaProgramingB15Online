package homeworks.upCasting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProStoreTest {

    public static void main(String[] args) {

        Product p1 = new Product("Mackbook Pro", 2999);
        Product p2 = new Product("Sonny TV", 499);
        Product p3 = new Product("Sonny TV", 499);

        System.out.println(p1 == p2);
        System.out.println(p2 == p3);

        System.out.println(p1.getPrice());
        System.out.println(p1.equals("Art Book"));
        p1.setName("Turn of Mind ");
        System.out.println(p1.getName());
        System.out.println("p1 = " + p1);


        List<Product> list = new ArrayList<>(Arrays.asList(new Product("Test Book", 30),
                new Product("Seamstress", 25), new Product("A Thousand Splendid Suns", 29)));



        Store s1 = new Store(list);

        System.out.println(s1);
        s1.removeProduct(list.get(0));
        System.out.println(s1);
        System.out.println(s1);
        System.out.println("Max price is: " + s1.maxPrice());
        System.out.println("Sum :" + s1.sumOfItems());

        s1.checkIfProductExist(new Product("On The Town In New York", 40));
    s1.checkIfProductExist(new Product("Test Book", 30));
    }
}
