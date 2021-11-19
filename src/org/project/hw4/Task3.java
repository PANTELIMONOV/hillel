package org.project.hw4;

public class Task3 {
    public static void main(String[] args) {
        int[] intArray = new int[]{-1, 0, 3, 4, -2, 7, 8, 8, 3};
        int i = intArray[0];

        for (int num : intArray) {
            if (num < i) i = num;
        }
        System.out.println(i);
    }
}

//3. Write a program that finds the minimum value in an array