package org.example.intermedeate.model;

import org.example.intermedeate.model.Toys;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyBox {
    private ArrayList<Toys> toys;

    public ToyBox(ArrayList<Toys> toys) {
        this.toys = toys;
    }

    public void addToy(int id, int quantity) {
        for (Toys toy : toys) {
            if (toy.getId() == id) {
                toy.addQuantity(quantity);
                return;
            }
        }
        System.out.println("Toy id not found.");
    }

    public void updateWeight(int id, double weight) {
        for (Toys toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                return;
            }
        }
        System.out.println("Toy id not found.");
    }

    public boolean isEmpty() {
        return toys.isEmpty();
    }

    public Toys selectToy() {
        double totalWeight = toys.stream().mapToDouble(Toys::getWeight).sum();
        double rand = new Random().nextDouble() * 100;
        double countWeight = 0;
        for (Toys toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight / totalWeight * 100 >= rand) {
                if (toy.getQuantity() > 0) {
                    toy.addQuantity(-1);
                    toys.remove(toy);
                    return toy;
                } else {
                    System.out.println("No more quantity for toy id " + toy.getId() + ".");
                    return null;
                }
            }
        }
        System.out.println("No toy selected. Check weight and quantity values.");
        return null;
    }

    public void writeToyToFile(Toys toy) {
        System.out.println("Toy id " + toy.getId() + " with name " + toy.getName() + " is selected.");
        // write selected toy to file
        // ...
    }
}

