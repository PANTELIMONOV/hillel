package org.project.hw3;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your purchase amount:");
        double sum = in.nextDouble();

        double discountSum = sum - (sum * 0.15);

        if (sum > 1000) {
            System.out.println("Amount including discount: " + discountSum + "$");
        } else {
            System.out.println("No discounts for your amount");
        }
    }
}

//Сумма покупки составляет а$. Если а больше 1000$, то предоставляется скидка 15%.
// Вывести на экран сумму покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.
