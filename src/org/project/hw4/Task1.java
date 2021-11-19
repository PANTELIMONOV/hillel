package org.project.hw4;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3, 0, 0};

        for (int i = 0; i < intArray.length; i++) {
            for (int c = i + 1; c < intArray.length; c++)
                if (intArray[i] == intArray[c]) System.out.println(intArray[c]);
        }
    }
}

//1. Program to print the duplicate elements of an array
//In this program, we need to print the duplicate elements present in the array. This can be done through two loops.
// The first loop will select an element and the second loop will iteration through the array by comparing the selected
// element with other elements. If a match is found, print the duplicate element.
//Program to print the duplicate elements of an array
//In the above array, the first duplicate will be found at the index 4 which is the duplicate of the element (2)
// present at index 1. So, duplicate elements in the above array are 2, 3 and 8.
//        arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.