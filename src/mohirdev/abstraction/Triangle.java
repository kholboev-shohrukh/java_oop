package mohirdev.abstraction;
public class Triangle extends GeometricFigure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void area() {
        double perimeter = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(perimeter*(perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
        System.out.println("Area: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = (sideA + sideB + sideC);
    }
}
