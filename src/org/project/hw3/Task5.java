package org.project.hw3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int x;

        if (a == 0) {
            System.out.println("x can have any value");
        } else if (b == 0) {
            System.out.println("x = 0");
        } else {
            x = -b / a;
            System.out.println("x = " + x);
        }
    }
}

//5.Написать программу, которая бы решала уравнение вида a * x + b = 0
//Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
// Программа должна также учитывать варианты, когда или а = 0 или b = 0
