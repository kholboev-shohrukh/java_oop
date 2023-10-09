import task2.oop.MyTime;

public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime();
        time.setTime(23, 00, 00);
//        System.out.println(time.toString());
//        time.nextSecond();
//        System.out.println(time.toString());
//        time.nextMinut();
//        System.out.println(time.toString());

        System.out.println(time.toString());
        time.previousSecond();
        System.out.println(time.toString());
        time.previousMinut();
        System.out.println(time.toString());
    }
}