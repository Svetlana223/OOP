package org.example.sem3.sem3;

import org.example.sem3.sem3.model.AnimalComparator;
import org.example.sem3.sem3.model.AnimalShelter;
import org.example.sem3.sem3.model.Cat;
import org.example.sem3.sem3.model.Dog;

import java.util.Collections;
import java.util.List;

public class ex1 {
    //Создать классы cat и dog
    //Для них создать класс AnimalShelter с наследниками для cat и dog
    //Добавить возможность сравнения животных между собой и итерации по ним
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        for (int i = 0; i < 5; i++) {
            if(i % 2 == 0){
                shelter.addAnimal(new Cat("cat" + i, i * 2, i * 3));
            } else {
                shelter.addAnimal(new Dog("dog" + i, i * 2, i * 3));
            }

        }
        shelter.print();
        System.out.println("---");

        AnimalComparator comparator = new AnimalComparator();
        List result = shelter.getAnimals();

        Collections.sort(result, comparator);
        System.out.println(result);
        System.out.println("---");
        shelter.sort(new AnimalComparator());
        shelter.print();
    }
}
