package org.example.sem3.sem3.model;

public abstract class Animal {
    private String name;
    private Integer age;
    private Integer weight;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
