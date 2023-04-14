package org.example.sem2.homework;

import java.util.HashSet;
import java.util.Scanner;

public class Filter{
    HashSet<Laptop> laptops = ItemsLaptop.createLaptop();

    public void filter() {
        System.out.print("Введите цифру, соответствующую необходимому критерию: \n " +
                "1 - Название: \n" +
                "2 - ОЗУ: \n" +
                "3 - Объем ЖД: \n" +
                "4 - Операционная система \n" +
                "5 - Цвет");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> foundByName(askString());
            case 2 -> foundByRam(askInt());
            case 3 -> foundByRom(askInt());
            case 4 -> foundByOs(askString());
            case 5 -> foundByColor(askString());
            default -> System.out.println("Предмет не найден");
        }
    }

    private static Integer askInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметр: ");
        return sc.nextInt();
    }

    private static String askString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметр: ");
        return sc.nextLine();
    }

    public void foundByRam(Integer value) {
        for (Laptop item : laptops) {
            if (item.getRam().equals(value)) {
                System.out.println(item);
            }
        }

    }

    public void foundByRom(Integer value) {
        for (Laptop item : laptops) {
            if (item.getRom().equals(value)) {
                System.out.println(item);
            }
        }

    }

    public void foundByName(String value) {
        for (Laptop item : laptops) {
            if (item.getName().equals(value)) {
                System.out.println(item);
            }
        }

    }

    public void foundByOs(String value) {
        for (Laptop item : laptops) {
            if (item.getOperatingSystem().equals(value)) {
                System.out.println(item);
            }
        }

    }

    public void foundByColor(String value) {
        for (Laptop item : laptops) {
            if (item.getColor().equals(value)) {
                System.out.println(item);
            }
        }

    }
}
