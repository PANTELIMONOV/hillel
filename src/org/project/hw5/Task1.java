package org.project.hw5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your even number:");
        int number = in.nextInt();
        System.out.println(isEven(number));
    }

    public static boolean isEven(int number){
        boolean result;
        result = (number % 2) < 1;
        return result;
    }


}

//Write method which returns True or False if a given number is even or odd
