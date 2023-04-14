package org.example.sem3.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product1> list = new ArrayList<>();
        list.add(new HotDrinks1("Coffee", 200.0,91));
        list.add(new HotDrinks1("Tea",200.2,90));
        list.add(new HotDrinks1("Coffee2",  200.1,91));
        HotDrinksVendingMachine1 mach1 = new HotDrinksVendingMachine1(list);
        System.out.println(mach1.getProduct("Coffee",91));

        System.out.println("Список горячих напитков");
        for (Product1 el: list) {
            System.out.println(el);
        }
        System.out.println("Список горячих напитков c сортировкой по цене используя Iterator:");
        list.sort(new HotDrinksComparator());
        Iterator<Product1> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }






    }
}
