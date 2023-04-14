package org.example.sem3.homework;

public interface VendingMachine {
    Product1 getProduct(String name, int volume) throws IllegalStateException;
}
