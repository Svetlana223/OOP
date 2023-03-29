package org.example.sem1.cw1.model;

public class Water extends Product {
    private Double volume;
    public Water(String name, Double price) {
        super(name, price);
    }

    public Water(String name, Double price, Double volume) {
        super(name, price);
        this.volume = volume;
    }
}
