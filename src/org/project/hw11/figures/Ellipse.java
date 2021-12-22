package org.project.hw11.figures;

public class Ellipse implements Figures {
    double a;
    double b;

    @Override
    public void figureArea() {
        double A = 3.14 * a * b;
        System.out.println(A);
    }

    @Override
    public void figurePerimeter() {
        double P = 2 * 3.14 * Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) / 2);
        System.out.println(P);
    }
}
