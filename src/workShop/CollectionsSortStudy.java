package workShop;

import day39.Car;
import day52.polymorphism.Circle;
import day52.polymorphism.Shape;
import day52.polymorphism.Square;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortStudy {
    public static void main(String[] args) {
        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Cyborg");
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");
        superHeroes.add("Wonder Woman");

        Collections.sort(superHeroes);
        System.out.println(superHeroes);




    }
}
