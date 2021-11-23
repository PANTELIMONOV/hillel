package org.project.hw5;

import java.util.Arrays;

public class Task3 {

    public static int[] codesArray(char[] chars) {
        int[] codesArray = new int[chars.length];
        for (int j = 0; j < chars.length; j++) {
            codesArray[j] = chars[j];
        }
        return codesArray;
    }

    public static void main(String[] args) {
        char[] charArray = new char[]{'s', 'D', 'f'};
        System.out.println(Arrays.toString(codesArray(charArray)));
    }
}

//Write a method which returns an array of codes for given array of chars
