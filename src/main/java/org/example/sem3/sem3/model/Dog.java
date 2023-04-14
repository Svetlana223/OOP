package org.example.sem3.sem3.model;

public class Dog extends Animal{
    public Dog(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Dog-" + this.getName() + " " + this.getWeight();
    }
}
