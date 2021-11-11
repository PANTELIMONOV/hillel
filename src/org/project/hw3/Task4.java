package org.project.hw3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        int firstNumber = in.nextInt();
        System.out.println("Please enter your second number:");
        int secondNumber = in.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The number " + firstNumber + " has the greatest value");
        } else if (firstNumber < secondNumber) {
            System.out.println("The number " + secondNumber + " has the greatest value");
        } else
            System.out.println("The numbers are equal");
    }
}

//4.Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел большее, а какое меньшее.
// Программа должна вывести что-то типа “The number x has the greatest value”. Где “x” одно из чисел
