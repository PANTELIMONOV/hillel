package org.project.hw3;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("Please enter your first number:");
        int firstNumber = in.nextInt();
        if (firstNumber < 0) a = -firstNumber;

        System.out.println("Please enter your second number:");
        int secondNumber = in.nextInt();
        if (secondNumber < 0) b = -secondNumber;

        if (a > b) {
            System.out.println("The number " + firstNumber + " has the greatest magnitude");
        } else if (a < b) {
            System.out.println("The number " + secondNumber + " has the greatest magnitude");
        } else
            System.out.println("The numbers have equal magnitude");
    }
}

//6.Написать программу которая будет сравнивать величину (magnitude) двух чисел. Например, если одно число = 3,
// а второе число = -9, программа должна выдать, что число -9 имеет большую величину.
