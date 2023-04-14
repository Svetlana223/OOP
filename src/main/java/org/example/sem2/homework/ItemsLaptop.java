package org.example.sem2.homework;

import java.util.HashSet;

public class ItemsLaptop extends Laptop{
    public static HashSet<Laptop> createLaptop () {
        HashSet<Laptop> set = new HashSet<>();
        set.add(new Laptop("lenovo", "silver", "windows", 64, 8));
        set.add(new Laptop("asus", "white", "windows", 64, 8));
        set.add(new Laptop("macbook", "silver", "ios", 256, 8));
        set.add(new Laptop("lenovo", "gold", "linux", 512, 16));
        return set;
    }
}
