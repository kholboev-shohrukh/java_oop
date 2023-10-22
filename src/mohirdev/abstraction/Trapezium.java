package mohirdev.abstraction;

public class Trapezium extends GeometricFigure {
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public void area() {
        double area = (sideA + sideB) * high / 2;
        System.out.println("Area: " + area);
    }

    @Override
    void perimeter() {

    }
}
