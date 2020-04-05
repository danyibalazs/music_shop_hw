package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String make;
    private String type;
    private String color;
    private String material;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String type, String make, String color, String material, double buyPrice, double sellPrice){
        this.type = type;
        this.make = make;
        this.color = color;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
