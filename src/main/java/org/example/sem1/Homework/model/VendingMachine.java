package org.example.sem1.Homework.model;

public interface VendingMachine {
    Product getProduct(int name, int volume) throws IllegalStateException;
}
