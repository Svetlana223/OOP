package org.example.sem1.cw1.model;

public class Chocolate extends Product {
    private Integer sugar;
    public Chocolate(String name, Double price) {
        super(name, price);
    }


    public Chocolate(String name, Double price, Integer sugar) {
        super(name, price);
        this.sugar = sugar;
    }
}
