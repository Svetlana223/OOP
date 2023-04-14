package org.example.sem3.sem3.model;

public class Cat extends Animal{
    public Cat(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Cat-" + this.getName() + " " + this.getWeight();
    }
}
