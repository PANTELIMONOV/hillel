package org.project.hw6;

public class task3 {
    public static int charCounter(String str, String ch) {
        String[] strArray = str.split("");
        int i = 0;
        for (String c : strArray) {
            if (c.equals(ch)) i++;
        }
        return i;
    }

    public static void main(String[] args) {
        String text = "Count the single character frequencies";
        System.out.println(charCounter(text, "a"));
    }
}

// Count the single character frequencies
