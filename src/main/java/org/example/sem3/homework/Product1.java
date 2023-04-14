package org.example.sem3.homework;

public abstract class Product1 {
    private String name;
    private Double volume;

    public Product1(String name, Double volume) {
        this.name = name;
        this.volume = volume;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", volume=" + volume +
                '}';
    }
}
