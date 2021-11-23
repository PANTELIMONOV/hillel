package org.project.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] intArray = new int[]{-1, 0, 3, 4, 2, 7, 8, 8, 3};
        System.out.println(Arrays.toString(arraySorting(intArray)));
    }

    public static int[] arraySorting(int[] intArray) {
        int c;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    c = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = c;
                }
            }
        }
        return intArray;
    }
}

//4. Write a program that sorts an array from minimum to maximum
