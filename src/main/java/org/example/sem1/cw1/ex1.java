package org.example.sem1.cw1;

import org.example.sem1.cw1.model.Chocolate;
import org.example.sem1.cw1.model.Product;
import org.example.sem1.cw1.model.VendingMachine;
import org.example.sem1.cw1.model.Water;

public class ex1 {
        public static void main(String[] args) {
                VendingMachine machine = new VendingMachine();
                machine.addProduct(new Chocolate("Snikers", 50.00, 2));
                machine.addProduct(new Chocolate("Mars", 60.00));
                machine.addProduct(new Water("Water 0,5l", 50.00, 0.5));
                machine.addProduct(new Water("Water 1l", 80.00));

                System.out.println(machine.getProductByName("Water"));
                System.out.println(machine.getProductByPrice(50.0));
        }
}
