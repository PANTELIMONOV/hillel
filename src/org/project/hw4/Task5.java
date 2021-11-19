package org.project.hw4;

public class Task5 {
    public static void main(String[] args) {
        String str = "String";
        int i = str.length();
        char[] charArray = new char[i];
        char[] newCharArray = new char[i];
        int c = 0;

        for (int j = 0; j < str.length(); j++) {
            charArray[j] = str.charAt(j);
        }

        while (i > 0) {
            newCharArray[c] = charArray[i - 1];
            i--;
            c++;
        }
        System.out.println(String.valueOf(newCharArray));
    }
}

//5. Write a program that outputs a reversible string (use an array of characters - char string [])