package org.project.hw6;

public class Task8 {
    public static void wordSquare(String str) {
        String[] wordArray = str.split("");
        String[] wordsArray = new String[str.length()];
        int i = 0, x = 1;
        for (String s : wordArray) {
            str = str + s;
            wordsArray[i] = str.substring(x);
            i++;
            x++;
        }
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String word = "word";
        wordSquare(word);
    }
}

// Square word patterns. Given a word, print a square made from letter rotations of the word.
