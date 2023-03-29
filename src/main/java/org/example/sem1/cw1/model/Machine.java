package org.example.sem1.cw1.model;

import java.util.ArrayList;

public interface Machine {
    public ArrayList<Product> getProductByName(String searchName);
    public ArrayList<Product> getProductByPrice (Double searchPrise);
}
