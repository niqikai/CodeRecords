package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
public class Flower {
    private String color;
    private int price;



    public static List<Flower> filterFlower(List<Flower> flowers, Predicate<Flower> filter) {
        List<Flower> resList = new ArrayList<>();
        for (Flower flower : flowers) {
            if (filter.test(flower)) {
                resList.add(flower);
            }
        }
        return resList;
    }

}


interface FilterPrecidate {
    boolean test(Flower flower);
}


