package task2.oop;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        if ((hour >= 0 || hour <= 23)
                && (minute >= 0 || minute <= 59)
                && (second >= 0 || second <= 59)) {
            setHour(hour);
            setMinute(minute);
            setSecond(second);
        } else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString(){
        String hourS, minuteS, secondS;
        hourS = String.valueOf(getHour());
        minuteS = String.valueOf(getMinute());
        secondS = String.valueOf(getSecond());
        String result;
        if(getHour() < 10 || getMinute() < 10 || getSecond() < 10){
            if (getHour() < 10){
                hourS = "0" + hour;
            }
            if (getMinute() < 10){
                minuteS = "0" + minute;
            }
            if (getSecond() < 10){
                secondS = "0" + second;
            }
        }
        result = hourS + ":" + minuteS + ":" + secondS;
        return result;
    }
    public void nextSecond(){
        int plusS = second + 1;
        second = plusS % 60;
        int plusM = minute + plusS / 60;
        minute = plusM % 60;
        hour = hour + plusM / 60;
        hour = hour % 24;
    }
    public void nextMinut(){
        int plusM = minute + 1;
        minute = plusM % 60;
        hour = hour + plusM / 60;
        hour = hour % 24;
    }
    public void nextHour(){
        hour = hour + 1;
        hour = hour % 24;
    }

    public void previousSecond(){
        int plusS = (second - 1) + 60;
        second = plusS % 60;
        int plusM = (minute - plusS / 60) + 60;
        minute = plusM % 60;
        hour = (hour - plusM / 60) + 24;
        hour = hour % 24;
    }
    public void previousMinut(){
        int plusM = (minute - 1) + 60;
        minute = plusM % 60;
        hour = (hour - plusM / 60) + 24;
        hour = hour % 24;
    }
    public void previousHour(){
        hour = (hour - 1) + 24;
        hour = hour % 24;
    }

}
