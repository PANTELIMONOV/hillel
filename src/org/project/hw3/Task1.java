package org.project.hw3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your mark:");
        int mark = in.nextInt();

        if (mark >= 50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        System.out.println("DONE");
    }
}

//1.Написать программу с названием “CheckPassFail”, которая выводит PASS если переменная “mark” типа int больше или
// равно 50 или вывести “FAIL” в противном случае.Программа всегда должна перед выходом печатать “DONE”
