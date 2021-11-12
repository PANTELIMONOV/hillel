package org.project.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your weight:");
        double weight = in.nextDouble() * 0.45359237;
        System.out.println("Please enter your height:");
        double height = in.nextDouble() * 0.0254;

        System.out.println("Your Body Mass Index is: " + weight / (height * height));
    }
}

//3. Write a Java program to compute body mass index (BMI).
//        Test Data
//        Input weight in pounds: 452
//        Input height in inches: 72
//        Expected Output:
//        Body Mass Index is 61.30159143458721

