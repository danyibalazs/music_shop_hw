package accessories;

import behaviour.ISell;

public class Accessory implements ISell {

    private String type;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String type, double buyPrice, double sellPrice) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
