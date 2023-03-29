package org.example.sem1.Homework.model;

public abstract class Product {
    private Integer name;
    private Integer volume;

    public Product(Integer name, Integer volume) {
        this.name = name;
        this.volume = volume;
    }





    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
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
