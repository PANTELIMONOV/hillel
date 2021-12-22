package org.project.hw11.printable;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public void printBooks(Printable[] printable){
        for (int i = 1; i < printable.length; i++)
        {
            if (printable[i] instanceof Book) {
                System.out.println(((Book) printable[i]).name);
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print " + name);
    }
}
