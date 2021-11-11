package org.project.hw2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your minimum:");
        int min = in.nextInt();
        System.out.println("Please enter your maximum:");
        int max = in.nextInt();
        int rnd = (int) (Math.random() * (max - min) + min);

        System.out.println(rnd);
    }
}
