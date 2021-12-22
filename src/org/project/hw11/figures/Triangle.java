package org.project.hw11.figures;

public class Triangle implements Figures {
    double a;
    double b;
    double c;
    double h;

    @Override
    public void figureArea() {
        double A = b * h / 2;
        System.out.println(A);
    }

    @Override
    public void figurePerimeter() {
        double P = a + b + c;
        System.out.println(P);
    }
}
