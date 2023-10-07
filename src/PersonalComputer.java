public class PersonalComputer extends Computer{

    private String type;
    private String size;
    private double price;

    public PersonalComputer(String microelectronic, String nanoelectronic, String optoelectronic, String logicalOperation, String digitilElectronic, String type, String size, double price) {
        super(microelectronic, nanoelectronic, optoelectronic, logicalOperation, digitilElectronic);
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
