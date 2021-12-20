package org.project.hw11.figures;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.a = 10;
        rectangle.b = 25;
        rectangle.figureArea();
        rectangle.figurePerimeter();

        Ellipse ellipse = new Ellipse();
        ellipse.a = 50.6;
        ellipse.b = 60;
        ellipse.figureArea();
        ellipse.figurePerimeter();

        Triangle triangle = new Triangle();
        triangle.a = 33;
        triangle.b = 10;
        triangle.c = 20;
        triangle.h = 15;
        triangle.figureArea();
        triangle.figurePerimeter();
    }
}
