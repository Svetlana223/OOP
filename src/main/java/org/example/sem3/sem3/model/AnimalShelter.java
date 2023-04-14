package org.example.sem3.sem3.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals;
    public AnimalShelter(){
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void print(){
        for (Animal el : animals){
            System.out.println(el);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    public void sort(AnimalComparator comparator){
        Collections.sort(animals, comparator);

    }
}
