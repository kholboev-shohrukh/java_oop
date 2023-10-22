package mohirdev.inheritance;

public class Subwoofer extends Sound {

    private String type;
    private String price;

    public Subwoofer(String microelectronic, String nanoelectronic, String optoelectronic, String physiology, String psychology, String type, String price) {
        super(microelectronic, nanoelectronic, optoelectronic, physiology, psychology);
        this.type = type;
        this.price = price;
    }

    public Subwoofer(String physiology, String psychology, String type, String price) {
        super(physiology, psychology);
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
