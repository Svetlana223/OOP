package org.example.intermedeate;

import org.example.intermedeate.model.Toys;
import org.example.intermedeate.model.ToyBox;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Toys toy1 = new Toys(1, "Кубик-Рубик", 50, 30);
        Toys toy2 = new Toys(2, "Мяч", 20, 20);
        Toys toy3 = new Toys(3, "Кукла", 30, 50);

        ArrayList<Toys> toys = new ArrayList<>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);

        ToyBox toyBox = new ToyBox(toys);

// добавить игрушку по id
        toyBox.addToy(1, 5);
        toyBox.addToy(2, 2);

// обновить вес для игрушки по id
        toyBox.updateWeight(1, 40);

// выбор случайной игрушки, запись в файл, удаление из коробки
        while (!toyBox.isEmpty()) {
            Toys selectedToy = toyBox.selectToy();
            if (selectedToy != null) {
                toyBox.writeToyToFile(selectedToy);
            }
        }
    }
}
