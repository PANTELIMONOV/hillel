package org.project.loginProgram;

//Создать программу, которая логинит пользователя. На стартовом экране запрашиваете логин  пароль.
// Если логин удачный, переходим на след экран. Если нет, выводим ошибку. Пара логин-пароль храниться в переменных.
// После удачного логина выводим меню с 5 вариантами задач.Добавить обработку ошибок.

import java.util.Scanner;

public class loginProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your login:");
        String login = in.nextLine();
        System.out.println("Please enter your password:");
        String pass = in.nextLine();

        if (login.equals("admin") && pass.equals("qwerty")) {
            tasks();
        } else System.out.println("Wrong credentials");
    }

    public static void tasks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose your program:\n 1.Even number? \n 2.Armstrong number? \n 3.Reverse string" +
                "\n 4.Fibonacci sequence \n 5.Replace characters");
        int taskNumber = in.nextInt();

        switch (taskNumber) {
            case 1:
                evenNumber();
                break;
            case 2:
                armstrong();
                break;
            case 3:
                reverse();
                break;
            case 4:
                fibonacci();
                break;
            case 5:
                replace();
                break;
            default:
                System.out.println("Not valid number");
        }
    }

    // Even Number (Напишите программу которая определяет, является ли число четным или нет.
    // Проверять только целые числа. Добавить обработку ошибок с описанием.

    public static void evenNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number = in.nextInt();

        if (number % 2 == 0) System.out.println("True");
        else if (number % 2 > 0) System.out.println("False");
        else System.out.println("Wrong input!");
    }

    // Armstrong (Напишите программу для проверки является ли введенное число - числом Армстронга.
    // Число Армстронга это число, значение которого равно сумме цифр, из которых оно состоит, возведенных в степень,
    // равную количеству цифр в этом числе.

    public static void armstrong() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number = in.nextInt();
        int armstrong = 0;

        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        for (int i : numbers) {
            armstrong = (int) (armstrong + Math.pow(i, numbers.length));
        }

        if (number == armstrong) System.out.println("True");
        else System.out.println("False");
    }

    // Reverse Напишите программу для переворачивания строки, изменив расположение символов в строке задом наперёд
    // без использования встроенных в String функций.

    public static void reverse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String str = in.nextLine();

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

    // Fibonacci (Рассчитать первых 50 чисел Фибоначии вывести их на экран)

    public static void fibonacci() {
        int n1 = 0, n2 = 1, n3, i, count = 50;

        for (i = 1; i <= count; ++i) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    // Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль.
    // Выводит новую строку на экран. Добавить обработку длины строки, максимальная длина 30 символов.
    // Строка может состоять из нескольких слов и любых символов)

    public static void replace() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String str = in.nextLine();

        if (str.length() > 30) System.out.println("String must be shorter");

        String newStr = (str.replace("a", "@")).replace("o", "0");
        System.out.println(newStr);
    }
}
