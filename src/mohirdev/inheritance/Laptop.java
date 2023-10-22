package mohirdev.inheritance;

public class Laptop extends Computer {
    private String model;
    private String price;

    public Laptop(String microelectronic, String nanoelectronic, String optoelectronic, String logicalOperation, String digitilElectronic, String model, String price) {
        super(microelectronic, nanoelectronic, optoelectronic, logicalOperation, digitilElectronic);
        this.model = model;
        this.price = price;
    }

    public Laptop(String logicalOperation, String digitilElectronic, String model, String price) {
        super(logicalOperation, digitilElectronic);
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
