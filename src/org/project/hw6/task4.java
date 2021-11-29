package org.project.hw6;

public class task4 {
    public static int worldsCounter(String str) {
        String[] strArray = str.split(" ");
        return strArray.length;
    }

    public static void main(String[] args) {
        String text = "Count the single character frequencies";
        System.out.println(worldsCounter(text));
    }
}

// Count the words in some text
