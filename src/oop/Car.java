package oop;

public class Car {
    private String color;
    private String model;
    private String price;
    private String type;

    public Car() {
    }

    public Car(String color, String model, String price, String type) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void carInformation(){
        System.out.println("Model: " + model + ", Color: " + color + " Price: " + price + " Type: " + type);
    }
}
