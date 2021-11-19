package org.project.hw4;

public class Task2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"one", "two", "three", "four"};
//        int[] arr = new int[]{1, 2, 3, 4, 5};
        int i = arr.length;
        while (i > 0) {
            System.out.println(arr[i - 1]);
            i--;
        }
    }
}

//2. Program to print the elements of an array in reverse order
// In this program, we need to print the elements of the array in reverse order that is; the last element should be
// displayed first, followed by second last element and so on.
//
//Program to print the elements of an array in reverse order
// int[] = {1, 2, 3, 4, 5} OR String[] = {"one", "two", "three", "four"}

