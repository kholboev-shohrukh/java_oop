public class Loudspeaker extends Sound{

    private String model;
    private String price;

    public Loudspeaker(String microelectronic, String nanoelectronic, String optoelectronic, String physiology, String psychology, String model, String price) {
        super(microelectronic, nanoelectronic, optoelectronic, physiology, psychology);
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
