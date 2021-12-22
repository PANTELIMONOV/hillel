package org.project.hw11.printable;

public class Test {
    public static void main(String[] args) {
        Printable[] printable = new Printable[20];
        printable[0] = new Book("Book0");
        for (int i = 1; i < printable.length; i++)
        {
            if (i % 2 == 0) {
                printable[i] = new Book("Book"+i);
            } else {printable[i] = new Magazine("Magazine" + i); };
        }

        for (Printable value : printable) {
            value.print();
        }
    }
}
