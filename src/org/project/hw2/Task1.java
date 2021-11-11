package org.project.hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter inches value:");
        double inch = in.nextDouble();
        System.out.println("Your value in meters: " + inch * 0.0254);
    }
}

//1. Write a Java program that reads a number in inches, converts it to meters.
//        Note: One inch is 0.0254 meter.
//        Test Data
//        Input a value for inch: 1000
//        Expected Output :
//        1000.0 inch is 25.4 meters
