package org.project.hw6;

import java.util.Objects;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(randomize("alphanumeric", 10));
    }

    public static String randomize(String mode, int stringLength) {
        String randomizedString = "";
        Random random = new Random();
        if (Objects.equals(mode, "alpha") && stringLength > 0) {
            for (int i = 0; i < stringLength; i++) {
                randomizedString += (char) (random.nextInt(26) + 'a');
            }
        } else if (Objects.equals(mode, "numeric") && stringLength > 0) {
            for (int i = 0; i < stringLength; i++) {
                randomizedString += random.nextInt(10);
            }
        } else if (Objects.equals(mode, "alphanumeric") && stringLength > 0) {
            for (int i = 0; i < stringLength; i++) {
                int x = random.nextInt(10);
                if (x % 2 == 0) {
                    randomizedString += (char) (random.nextInt(26) + 'a');
                } else randomizedString += random.nextInt(10);
            }
        } else randomizedString = "Wrong input data!";

        return randomizedString;
    }
}

//Write a method that accepts two parameters: mode of type String and length of type int.
//This function should return a randomly generated string of given length according to the specified mode.
//Modes: alpha, numeric, alphanumeric
//Output —> String.
