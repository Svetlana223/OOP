package org.example.sem3.homework;

import java.util.Comparator;

public class HotDrinksComparator implements Comparator<Product1> {
    @Override
    public int compare(Product1 o1, Product1 o2) {
        return o1.getVolume().compareTo(o2.getVolume());
    }
}
