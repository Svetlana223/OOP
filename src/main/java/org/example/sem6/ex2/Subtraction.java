package org.example.sem6.ex2;

public class Subtraction implements CalculatorOperation{
    private Double right;
    private Double left;
    private Double result = 0.0;

    public Subtraction(Double right, Double left) {
        this.right = right;
        this.left = left;
    }


    public Double getRight() {
        return right;
    }

    public void setRight(Double right) {
        this.right = right;
    }

    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
