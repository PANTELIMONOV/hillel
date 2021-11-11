package org.project.hw2;

import java.util.Scanner;

public class Task3 {
    public static double square(double value) {

        return value * value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your distance in meters:");
        double weight = in.nextDouble() * 0.45359237;
        System.out.println("Please enter your height:");
        double height = in.nextDouble() * 0.0254;

        System.out.println("Your Body Mass Index is: " + weight / square(height));
    }
}
