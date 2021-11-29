package org.project.hw6;

public class task5 {
    public static int wordLengthCounter(String str, int size) {
        str = str.replaceAll("[.,?!]", "");
        String[] strArray = str.split(" ");
        int i = 0;
        for (String c : strArray) {
            if (c.length() == size) i++;
        }
        return i;
    }

    public static void main(String[] args) {
        String text = "Count ad ndv dev, e evv eee!?";
        System.out.println(wordLengthCounter(text, 3));
    }
}

// Count words of each length
