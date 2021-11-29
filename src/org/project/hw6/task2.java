package org.project.hw6;

public class task2 {
    public static void changeCase(String str) {
        String[] strArray = str.split("");
        StringBuilder newString = new StringBuilder();
        for (String c : strArray) {
            newString.append(c.toLowerCase());
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        changeCase("ASD2FG HJ");
    }
}

//Upper/Lower case
//Change given text into all upper case or lower case or change the first letter of each word (or
//sentence) to upper and the rest to lower, etc
