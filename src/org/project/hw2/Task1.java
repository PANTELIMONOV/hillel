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
