package org.project.hw11.printable;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public void printMagazines(Printable[] printable) {
        for (int i = 1; i < printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                System.out.println(((Magazine) printable[i]).name);
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print " + name);
    }
}
