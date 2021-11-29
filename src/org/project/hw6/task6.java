package org.project.hw6;

public class task6 {
    public static String letterRemoval(String str, String ch) {
        String[] strArray = str.split("");
        int i = 0;
        for (String c : strArray) {
            if (c.equals(ch)) strArray[i] = "";
            i++;
        }
        String strNew = String.join("", strArray);
        return strNew;
    }

    public static void main(String[] args) {
        String text = "Count the single character frequencies";
        System.out.println(letterRemoval(text, "e"));
    }
}

// Letter removal. Given a phrase and a letter (or series of letters)
// remove all occurrences of that letter(s) in the phrase.
