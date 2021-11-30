package org.project.hw6;

public class Task7 {
    public static boolean codeValidator(String str) {
        String[] codeArray = str.split(" ");
        int secondDigitPart = Integer.parseInt(codeArray[1]);
        String strDigits = codeArray[0].replaceAll("[A-Z]", "");
        char[] charDigitsArray = strDigits.toCharArray();
        boolean checkResult = false;

        for (char c : charDigitsArray)
            if (Character.isDigit(c) && (strDigits.length() == 6)) {
                int multiPairs = Integer.parseInt(strDigits.substring(0, 2)) *
                        Integer.parseInt(strDigits.substring(2, 4)) *
                        Integer.parseInt(strDigits.substring(4, 6));
                checkResult = multiPairs == secondDigitPart;
            } else checkResult = false;
        return checkResult;
    }

    public static void main(String[] args) {
        String code = "AX6BYU56UX6CV6BNT7NB 287430";
        System.out.println("Does this code valid? : " + codeValidator(code));
    }
}

// Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
//1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
//first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.
