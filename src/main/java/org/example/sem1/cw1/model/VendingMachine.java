package org.example.sem1.cw1.model;

import java.util.ArrayList;

public class VendingMachine implements Machine {
    private ArrayList<Product> list;


    public VendingMachine() {
        list = new ArrayList<Product>();
    }

    public void addProduct(Product newItem){
        list.add(newItem);
    }

    public ArrayList<Product> getProductByName(String searchName) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item: list) {
            if (item.getName().contains(searchName)){
                result.add(item);
            }

        }
        return result;
    }
    public ArrayList<Product> getProductByPrice (Double searchPrise) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item: list) {
            if (item.getPrice().equals(searchPrise)){
                result.add(item);
            }

        }
        return result;
    }
}
