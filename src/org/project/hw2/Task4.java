package org.project.hw2;

import java.util.Scanner;

public class Task4 {
    private static final float coefficient = (float) 3.6;

    public static float speed(float distance, float hours, float minutes, float seconds) {
        return distance / (hours * 3600 + minutes * 60 + seconds);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your distance:");
        int distance = in.nextInt();
        System.out.println("Please enter your hours:");
        int hours = in.nextInt();
        System.out.println("Please enter your minutes:");
        int minutes = in.nextInt();
        System.out.println("Please enter your seconds:");
        int seconds = in.nextInt();

        System.out.println("Your speed in m/s: " + speed(distance, hours, minutes, seconds));
        System.out.println("Your speed in km/h: " + speed(distance, hours, minutes, seconds) * coefficient);
    }
}
