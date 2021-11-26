package org.project.hw5;

public class Task2 {

    public static int sumArray(int[] numbers) {
        int sum = numbers[0];
        for (int j = 1; j < numbers.length; j++) sum = sum + numbers[j];
        return sum;
    }
}

//Write a method which returns the sum of a given array
