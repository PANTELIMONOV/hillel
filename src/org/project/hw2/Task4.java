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

//4. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
//
//        Test Data
//        Input distance in meters: 2500
//        Input hour: 5
//        Input minutes: 56
//        Input seconds: 23
//        Expected Output :
//        Your speed in meters/second is 0.11691531
//        Your speed in km/h is 0.42089513
