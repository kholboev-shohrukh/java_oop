package mohirdev.interfaces;

public class Converter implements BaseConverter{
    private double selsiy;

    public Converter(double selsiy) {
        this.selsiy = selsiy;
    }

    public double getSelsiy() {
        return selsiy;
    }

    public void setSelsiy(double selsiy) {
        this.selsiy = selsiy;
    }


    @Override
    public double selsiToKelvin() {
        return selsiy + 273.15;
    }

    @Override
    public double selsiToFarengeyt() {
        return selsiy * 9 / 5 + 32;
    }
}
