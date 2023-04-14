package org.example.sem3.homework;



import java.util.List;

public class HotDrinksVendingMachine1 implements VendingMachine {
    List<Product1> products;

    public HotDrinksVendingMachine1(List<Product1> products) {
        this.products = products;
    }


    @Override
    public Product1 getProduct(String name, int temperature) throws IllegalStateException {
        for(Product1 product: products){
            if(product instanceof HotDrinks1){
                if(product.getName().equals(name) && ((HotDrinks1) product).getTemperature() == temperature){
                    return (HotDrinks1) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }


}
