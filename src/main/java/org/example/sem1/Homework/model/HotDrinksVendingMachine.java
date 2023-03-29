package org.example.sem1.Homework.model;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<Product> products;

    public HotDrinksVendingMachine(List<Product> products) {
        this.products = products;
    }


    @Override
    public Product getProduct(int name, int temperature) throws IllegalStateException {
        for(Product product: products){
            if(product instanceof HotDrinks){
                if(product.getName().equals(name) && ((HotDrinks) product).getTemperature() == temperature){
                    return (HotDrinks) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }


}
