package org.example.sem3.sem3.model;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return -o1.getWeight().compareTo(o2.getWeight());
    }
}
