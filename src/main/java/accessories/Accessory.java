package accessories;

import behaviour.ISell;
import shop.ItemTypes;

public class Accessory implements ISell {

    private ItemTypes type;
    private double buyPrice;
    private double sellPrice;

    public Accessory(ItemTypes type, double buyPrice, double sellPrice) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public ItemTypes getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
