package org.example.sem6.ex2;

public class Main {
    public static void main(String[] args) {
        Addition add = new Addition(1.0, 2.0);
        Calculator calc = new Calculator();
        calc.calculatorSwitch(add);
        System.out.println(add.getResult());
    }
}
