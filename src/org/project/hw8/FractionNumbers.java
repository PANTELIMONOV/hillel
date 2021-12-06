package org.project.hw8;

public class FractionNumbers {
    public double firstNumber;
    public double secondNumber;

    public void stringResult(double result) {
        System.out.println(result);
    }

    public double plus() {
        return firstNumber + secondNumber;
    }

    public double minus() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        return firstNumber / secondNumber;
    }


}

//Write class to represent FractionNumbers. This class should contain two fields.
//This class should contain methods to perform basic math operations: plus, minus, multiply, divide.
//Also, this class should have toString method to print numbers into standard output
