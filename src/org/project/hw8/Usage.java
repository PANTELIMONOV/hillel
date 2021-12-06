package org.project.hw8;

public class Usage {
    public static void main(String[] args) {
        FractionNumbers fractionNumbers = new FractionNumbers();
        fractionNumbers.firstNumber = 100;
        fractionNumbers.secondNumber = 2.5;

        fractionNumbers.stringResult(fractionNumbers.plus());
        fractionNumbers.stringResult(fractionNumbers.minus());
        fractionNumbers.stringResult(fractionNumbers.multiply());
        fractionNumbers.stringResult(fractionNumbers.divide());
        fractionNumbers.stringResult(fractionNumbers.secondNumber);
    }
}

// Create additional class like App to check functionality of FractionNumber class
