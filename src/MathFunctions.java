public class MathFunctions {

    static private double pi = 3.14159265359;
    static private double e = 2.71828182846;

    public MathFunctions() {
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        MathFunctions.pi = pi;
    }

    public static double getE() {
        return e;
    }

    public static void setE(double e) {
        MathFunctions.e = e;
    }

    static double circle(double r){
        double s = r * r * pi;
        return s;
    }

    static double ePow(int n){
        double pow = Math.pow(e, n);
        return pow;
    }

    static double tArea(double a, double b, double c){
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
