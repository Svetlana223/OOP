package org.example.sem1.Homework;

import org.example.sem1.Homework.model.HotDrinks;
import org.example.sem1.Homework.model.HotDrinksVendingMachine;
import org.example.sem1.Homework.model.Product;
import org.example.sem1.Homework.model.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new HotDrinks(1,2,50));
        list.add(new HotDrinks(2,3,60));
        list.add(new HotDrinks(3,4,50));
        HotDrinksVendingMachine mach1 = new HotDrinksVendingMachine(list);
        System.out.println(mach1.getProduct(1,50));


    }
}
