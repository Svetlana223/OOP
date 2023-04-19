package org.example.sem6.ex2;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculator(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());

        }
    }

    public void calculatorCorrect(CalculatorOperation operation) {
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        } else new InvalidParameterException("Can not perform operation");
    }

    public void calculatorSwitch(CalculatorOperation operation) {
//        System.out.println(operation.getClass().getSimpleName());
        switch (operation.getClass().getSimpleName()) {
            case "Addition":
                Addition addition = (Addition) operation;
                addition.setResult(addition.getLeft() + addition.getRight());
                break;
            case "Subtraction":
                Subtraction subtraction = (Subtraction) operation;
                subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
                break;
            default: throw new InvalidParameterException("Can not perform operation");
        }
    }
}
