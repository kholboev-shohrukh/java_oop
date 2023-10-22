package mohirdev.statices;

public class MathFunctions {

    private static Double pi = 3.14159265359;
    private static Double e = 2.71828182846;

    public MathFunctions() {
    }

    public void circleA(double r){
        Double area = r * r * pi;
        System.out.println("Area : " + area);
    }

    public void ePower(double a){
        double power = Math.pow(e, a);
        System.out.println("e^" + a + "=" +  power);
    }

    public void area(double a, double b, double c){
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p*(p - a) * (p - b) * (p - c));
        System.out.println(area);
    }
}
