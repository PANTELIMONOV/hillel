package org.project.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter minutes value:");
        int minutes = in.nextInt();
        int years = minutes / 525600;
        int days = minutes % 525600 / 1440;
        System.out.println(minutes + " minutes is approximately " + years + " year(s) and " + days + " day(s).");
    }
}

//2. Write a Java program to convert minutes into a number of years and days.
//        Test Data
//        Input the number of minutes: 3456789
//        Expected Output :
//        3456789 minutes is approximately 6 years and 210 days
