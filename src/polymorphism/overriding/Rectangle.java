package polymorphism.overriding;

import polymorphism.overriding.GeometricFigure;

public class Rectangle extends GeometricFigure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public void area() {
        double area = sideA * sideB;
        System.out.println("Area: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2*sideA + 2*sideB;
        System.out.println("Perimeter: " + perimeter);
    }
}
