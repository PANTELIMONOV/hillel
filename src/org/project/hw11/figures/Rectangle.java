package org.project.hw11.figures;

public class Rectangle implements Figures {
    double a;
    double b;

    @Override
    public void figureArea() {
        double A = 0.5 * a * b;
        System.out.println(A);
    }

    @Override
    public void figurePerimeter() {
        double P = 2 * a + 2 * b;
        System.out.println(P);
    }
}
