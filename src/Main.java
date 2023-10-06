public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        double doiraYuzi = MathFunctions.circle(3);
        System.out.println("Yuza: " + doiraYuzi);
        double ePow = MathFunctions.ePow(2);
        System.out.println("e^" + ePow);
        double s = MathFunctions.tArea(3,4,5);
        System.out.println("Uchburchak Yuzasi: " + s);
    }
}